package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Buyer;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.Buyer_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Buyer_Service {
    @Autowired
    Buyer_Repository buyer_repository;
    public List<Buyer> getAllBuyers() {

        return buyer_repository.findAll();
    }

    public Buyer getBuyerById(Long id) {

        return buyer_repository.findById(id).get();
    }
}
