package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Seller;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {
    @Autowired
    SellerRepository sellerRepository;
    public List<Seller> getAllSellers() {

        return sellerRepository.findAll();
    }

    public Seller getSellerById(Long id) {

        return sellerRepository.findById(id).get();
    }
}
