package com.simulacred.domain.repositories;


import com.simulacred.domain.entities.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {
    Cliente findByCpf(String cpf);
}
