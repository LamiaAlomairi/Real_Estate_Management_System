package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Contract;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {
    @Autowired
    ContractRepository contractRepository;
    public List<Contract> getAllContracts() {

        return contractRepository.findAll();
    }

    public Contract getContractById(Long id) {

        return contractRepository.findById(id).get();
    }
}
