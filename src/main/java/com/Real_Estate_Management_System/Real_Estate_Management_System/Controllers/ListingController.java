package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Listing;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "listing")
public class ListingController {
    //    http://localhost:8080/listing/getAll
    @Autowired
    ListingService listingService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Listing> getAllListings() {

        return listingService.getAllListings();
    }
    @GetMapping(value = "getById")
    public Listing getListingById(@RequestParam Long id) {

        return listingService.getListingById(id);
    }
}
