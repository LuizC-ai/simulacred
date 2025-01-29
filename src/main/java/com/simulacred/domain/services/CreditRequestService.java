package com.simulacred.domain.services;

import com.simulacred.domain.entities.CreditRequest;
import com.simulacred.domain.repositories.CreditRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CreditRequestService {

    private final CreditRequestRepository creditRequestRepository;

    @Autowired
    public CreditRequestService(CreditRequestRepository creditRequestRepository) {
        this.creditRequestRepository = creditRequestRepository;
    }

    public CreditRequest solicitarCredito(CreditRequest creditRequest) {
        creditRequest.setDataSolicitacao(LocalDateTime.now());
        creditRequest.setStatus("EM_ANALISE");
        return creditRequestRepository.save(creditRequest);
    }

    public List<CreditRequest> listarSolicitacoesPorCliente(String clienteId) {
        return creditRequestRepository.findByClienteId(clienteId);
    }

    public void atualizarStatus(String id, String novoStatus) {
        CreditRequest request = creditRequestRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Solicitação não encontrada"));
        request.setStatus(novoStatus);
        creditRequestRepository.save(request);
    }
}