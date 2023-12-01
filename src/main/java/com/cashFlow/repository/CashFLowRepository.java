package com.cashFlow.repository;

import com.cashFlow.model.CashFlow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashFLowRepository extends JpaRepository<CashFlow, Long> {
}
