package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Seller;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.Seller_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "seller")
public class Seller_Controller {
    //    http://localhost:8080/seller/getAll
    @Autowired
    Seller_Service seller_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Seller> getAllSellers() {

        return seller_service.getAllSellers();
    }
    @GetMapping(value = "getById")
    public Seller getSellerById(@RequestParam Long id) {

        return seller_service.getSellerById(id);
    }
}
