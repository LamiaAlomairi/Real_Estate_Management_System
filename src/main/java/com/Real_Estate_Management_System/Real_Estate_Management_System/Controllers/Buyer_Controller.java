package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Buyer;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.Buyer_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "buyer")
public class Buyer_Controller {
    //    http://localhost:8080/buyer/getAll
    @Autowired
    Buyer_Service buyer_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Buyer> getAllBuyers() {

        return buyer_service.getAllBuyers();
    }
    @GetMapping(value = "getById")
    public Buyer getBuyerById(@RequestParam Long id) {

        return buyer_service.getBuyerById(id);
    }
}
