package com.simulacred.domain.repositories;

import com.simulacred.domain.entities.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends MongoRepository<Payment, String> {
    List<Payment> findByCreditRequestId(String creditRequestId);
}
