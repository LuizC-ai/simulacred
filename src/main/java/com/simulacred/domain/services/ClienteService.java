package com.simulacred.domain.services;

import com.simulacred.domain.entities.Cliente;
import com.simulacred.domain.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente cadastrarCliente(Cliente cliente) {
        if (clienteRepository.findByCpf(cliente.getCpf()) != null) {
            throw new IllegalArgumentException("Já existe um cliente cadastrado com este CPF.");
        }
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> buscarClientePorId(String id) {
        return clienteRepository.findById(id);
    }

    public Cliente buscarClientePorCpf(String cpf) {
        return clienteRepository.findByCpf(cpf);
    }
}
