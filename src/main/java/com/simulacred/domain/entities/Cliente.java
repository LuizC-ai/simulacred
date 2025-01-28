package com.simulacred.domain.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Document(collection = "clientes")
public class Cliente {

    @Id
    private String id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private BigDecimal rendaMensal;
    private Integer scoreCredito;


    public Cliente() {
    }


    public Cliente(String id, String nome, String cpf, LocalDate dataNascimento, BigDecimal rendaMensal, Integer scoreCredito) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.rendaMensal = rendaMensal;
        this.scoreCredito = scoreCredito;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public BigDecimal getRendaMensal() {
        return rendaMensal;
    }

    public void setRendaMensal(BigDecimal rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public Integer getScoreCredito() {
        return scoreCredito;
    }

    public void setScoreCredito(Integer scoreCredito) {
        this.scoreCredito = scoreCredito;
    }

    // Método toString() para facilitar depuração
    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", rendaMensal=" + rendaMensal +
                ", scoreCredito=" + scoreCredito +
                '}';
    }
}
