package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Payment;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.Payment_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "payment")
public class Payment_Controller {
    //    http://localhost:8080/payment/getAll
    @Autowired
    Payment_Service payment_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Payment> getAllPayments() {

        return payment_service.getAllPayments();
    }
    @GetMapping(value = "getById")
    public Payment getPaymentById(@RequestParam Long id) {

        return payment_service.getPaymentById(id);
    }
}
