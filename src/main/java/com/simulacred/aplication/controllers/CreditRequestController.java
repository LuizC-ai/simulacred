package com.simulacred.aplication.controllers;

import com.simulacred.domain.entities.CreditRequest;
import com.simulacred.domain.services.CreditRequestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/credit-requests")
public class CreditRequestController {

    private final CreditRequestService creditRequestService;

    public CreditRequestController(CreditRequestService creditRequestService) {
        this.creditRequestService = creditRequestService;
    }

    @PostMapping
    public CreditRequest solicitarCredito(@RequestBody CreditRequest creditRequest) {
        return creditRequestService.solicitarCredito(creditRequest);
    }

    @GetMapping("/{id}")
    public List<CreditRequest> listarSolicitacoesPorCliente(@PathVariable String id) {
        return creditRequestService.listarSolicitacoesPorCliente(id);
    }

    @PutMapping("/{id}/status")
    public void atualizarStatus(@PathVariable String id, @RequestParam String novoStatus) {
        creditRequestService.atualizarStatus(id, novoStatus);
    }
}
