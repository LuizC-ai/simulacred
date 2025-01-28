package com.simulacred.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "credit_history")
public class CreditHistory {
    @Id
    private String id;
    private String clienteId;
    private String detalhes;
    private LocalDate dataRegistro;
}
