package com.cashFlow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tab_movimentacao_caixa")
public class CashFlow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "aberto_em", nullable = false)
    private LocalDateTime openAt;
    @Column(name = "fechado_em", nullable = false)
    private LocalDateTime closedAt;
    @Column(name = "valor_inicial", nullable = false)
    private BigDecimal initialBalance;
}
