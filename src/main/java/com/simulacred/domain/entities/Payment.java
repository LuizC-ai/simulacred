package com.simulacred.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Document(collection = "payments")
public class Payment {

    @Id
    private String id;
    private String creditRequestId;
    private BigDecimal valorParcela;
    private LocalDate dataVencimento;
    private String status;

    public Payment() {
    }

    public Payment(String id, String creditRequestId, BigDecimal valorParcela, LocalDate dataVencimento, String status) {
        this.id = id;
        this.creditRequestId = creditRequestId;
        this.valorParcela = valorParcela;
        this.dataVencimento = dataVencimento;
        this.status = status;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreditRequestId() {
        return creditRequestId;
    }

    public void setCreditRequestId(String creditRequestId) {
        this.creditRequestId = creditRequestId;
    }

    public BigDecimal getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(BigDecimal valorParcela) {
        this.valorParcela = valorParcela;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
