package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Contract;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.Contract_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Contract_Service {
    @Autowired
    Contract_Repository contract_repository;
    public List<Contract> getAllContracts() {

        return contract_repository.findAll();
    }

    public Contract getContractById(Long id) {

        return contract_repository.findById(id).get();
    }
}
