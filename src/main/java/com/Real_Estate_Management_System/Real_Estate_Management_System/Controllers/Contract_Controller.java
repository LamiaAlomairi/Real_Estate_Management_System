package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Contract;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.Contract_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "contract")
public class Contract_Controller {
    //    http://localhost:8080/contract/getAll
    @Autowired
    Contract_Service contract_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Contract> getAllContracts() {

        return contract_service.getAllContracts();
    }
    @GetMapping(value = "getById")
    public Contract getContractById(@RequestParam Long id) {

        return contract_service.getContractById(id);
    }
}
