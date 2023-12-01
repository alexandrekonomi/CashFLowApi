package com.cashFlow.repository;

import com.cashFlow.model.Receive;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiveRepository extends JpaRepository<Receive, Long> {
}
