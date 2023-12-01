package com.cashFlow.repository;

import com.cashFlow.model.Sold;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoldRepository extends JpaRepository<Sold, Long> {
}
