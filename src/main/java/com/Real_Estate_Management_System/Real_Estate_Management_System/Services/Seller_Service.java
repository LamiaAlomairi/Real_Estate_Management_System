package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Seller;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.Seller_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Seller_Service {
    @Autowired
    Seller_Repository seller_repository;
    public List<Seller> getAllSellers() {

        return seller_repository.findAll();
    }

    public Seller getSellerById(Long id) {

        return seller_repository.findById(id).get();
    }
}
