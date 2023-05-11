package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Payment;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.Payment_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Payment_Service {
    @Autowired
    Payment_Repository payment_repository;
    public List<Payment> getAllPayments() {

        return payment_repository.findAll();
    }

    public Payment getPaymentById(Long id) {

        return payment_repository.findById(id).get();
    }
}
