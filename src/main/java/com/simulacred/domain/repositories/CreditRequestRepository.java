package com.simulacred.domain.repositories;


import com.simulacred.domain.entities.CreditRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditRequestRepository extends MongoRepository<CreditRequest, String> {
    List<CreditRequest> findByClienteId(String clienteId);
}
