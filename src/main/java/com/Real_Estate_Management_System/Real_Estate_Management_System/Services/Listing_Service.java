package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Listing;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.Listing_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Listing_Service {
    @Autowired
    Listing_Repository listing_repository;
    public List<Listing> getAllListings() {

        return listing_repository.findAll();
    }

    public Listing getListingById(Long id) {

        return listing_repository.findById(id).get();
    }
}
