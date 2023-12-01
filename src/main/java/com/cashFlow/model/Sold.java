package com.cashFlow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tab_liquidado")
public class Sold {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "data_pagamento", nullable = false)
    private LocalDateTime paymentDate;
    @Column(name = "valor", nullable = false)
    private BigDecimal value;
}
