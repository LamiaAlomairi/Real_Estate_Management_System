package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Contract;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "contract")
public class ContractController {
    //    http://localhost:8080/contract/getAll
    @Autowired
    ContractService contractService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Contract> getAllContracts() {

        return contractService.getAllContracts();
    }
    @GetMapping(value = "getById")
    public Contract getContractById(@RequestParam Long id) {

        return contractService.getContractById(id);
    }
}
