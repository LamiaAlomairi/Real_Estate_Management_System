package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Appraisal;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.Appraisal_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Appraisal_Service {
    @Autowired
    Appraisal_Repository appraisal_repository;
    public List<Appraisal> getAllAppraisals() {

        return appraisal_repository.findAll();
    }

    public Appraisal getAppraisalById(Long id) {

        return appraisal_repository.findById(id).get();
    }
}
