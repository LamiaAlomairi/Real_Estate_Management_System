package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Buyer;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "buyer")
public class BuyerController {
    //    http://localhost:8080/buyer/getAll
    @Autowired
    BuyerService buyerService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Buyer> getAllBuyers() {

        return buyerService.getAllBuyers();
    }
    @GetMapping(value = "getById")
    public Buyer getBuyerById(@RequestParam Long id) {

        return buyerService.getBuyerById(id);
    }
}
