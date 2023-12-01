package com.cashFlow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tab_pagar")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "valor", nullable = false)
    private BigDecimal value;
    @Column(name = "criado_em", nullable = false)
    private LocalDateTime createdAt;
}
