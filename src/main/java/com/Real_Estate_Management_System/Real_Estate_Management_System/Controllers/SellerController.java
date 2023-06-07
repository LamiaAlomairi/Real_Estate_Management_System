package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Seller;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "seller")
public class SellerController {
    //    http://localhost:8080/seller/getAll
    @Autowired
    SellerService sellerService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Seller> getAllSellers() {

        return sellerService.getAllSellers();
    }
    @GetMapping(value = "getById")
    public Seller getSellerById(@RequestParam Long id) {

        return sellerService.getSellerById(id);
    }
}
