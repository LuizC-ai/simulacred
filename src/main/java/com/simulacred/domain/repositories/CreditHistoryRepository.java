package com.simulacred.domain.repositories;

import com.simulacred.domain.entities.CreditHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CreditHistoryRepository extends MongoRepository<CreditHistory, String> {
    List<CreditHistory> findByClienteId(String clienteId);
}
