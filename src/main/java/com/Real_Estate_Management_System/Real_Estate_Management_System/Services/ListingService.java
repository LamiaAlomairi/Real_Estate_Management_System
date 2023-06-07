package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Listing;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListingService {
    @Autowired
    ListingRepository listingRepository;
    public List<Listing> getAllListings() {

        return listingRepository.findAll();
    }

    public Listing getListingById(Long id) {

        return listingRepository.findById(id).get();
    }
}
