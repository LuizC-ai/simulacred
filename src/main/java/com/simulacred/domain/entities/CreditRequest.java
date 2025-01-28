package com.simulacred.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Document(collection = "credit_requests")
public class CreditRequest {

    @Id
    private String id;
    private String clienteId;
    private BigDecimal valorSolicitado;
    private Integer prazoPagamento;
    private String status;
    private LocalDateTime dataSolicitacao;

    public CreditRequest() {
    }

    public CreditRequest(String id, String clienteId, BigDecimal valorSolicitado, Integer prazoPagamento, String status, LocalDateTime dataSolicitacao) {
        this.id = id;
        this.clienteId = clienteId;
        this.valorSolicitado = valorSolicitado;
        this.prazoPagamento = prazoPagamento;
        this.status = status;
        this.dataSolicitacao = dataSolicitacao;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public BigDecimal getValorSolicitado() {
        return valorSolicitado;
    }

    public void setValorSolicitado(BigDecimal valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }

    public Integer getPrazoPagamento() {
        return prazoPagamento;
    }

    public void setPrazoPagamento(Integer prazoPagamento) {
        this.prazoPagamento = prazoPagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDateTime dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }
}
