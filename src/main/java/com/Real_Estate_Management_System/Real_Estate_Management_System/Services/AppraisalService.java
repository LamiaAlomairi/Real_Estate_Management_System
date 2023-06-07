package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Appraisal;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.AppraisalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppraisalService {
    @Autowired
    AppraisalRepository appraisalRepository;
    public List<Appraisal> getAllAppraisals() {

        return appraisalRepository.findAll();
    }

    public Appraisal getAppraisalById(Long id) {

        return appraisalRepository.findById(id).get();
    }
}
