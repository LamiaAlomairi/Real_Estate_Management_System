package com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
