package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Listing;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.Listing_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "listing")
public class Listing_Controller {
    //    http://localhost:8080/listing/getAll
    @Autowired
    Listing_Service listing_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Listing> getAllListings() {

        return listing_service.getAllListings();
    }
    @GetMapping(value = "getById")
    public Listing getListingById(@RequestParam Long id) {

        return listing_service.getListingById(id);
    }
}
