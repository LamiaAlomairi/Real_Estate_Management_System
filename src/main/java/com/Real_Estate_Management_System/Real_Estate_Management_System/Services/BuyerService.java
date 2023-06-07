package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Buyer;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {
    @Autowired
    BuyerRepository buyerRepository;
    public List<Buyer> getAllBuyers() {

        return buyerRepository.findAll();
    }

    public Buyer getBuyerById(Long id) {

        return buyerRepository.findById(id).get();
    }
}
