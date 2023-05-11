package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Appraisal;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.Appraisal_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "appraisal")
public class Appraisal_Controller {
    //    http://localhost:8080/appraisal/getAll
    @Autowired
    Appraisal_Service appraisal_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Appraisal> getAllAppraisals() {

        return appraisal_service.getAllAppraisals();
    }
    @GetMapping(value = "getById")
    public Appraisal getAppraisalById(@RequestParam Long id) {

        return appraisal_service.getAppraisalById(id);
    }
}
