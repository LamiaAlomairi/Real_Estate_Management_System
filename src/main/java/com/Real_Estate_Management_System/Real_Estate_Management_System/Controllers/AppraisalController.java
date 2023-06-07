package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Appraisal;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.AppraisalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "appraisal")
public class AppraisalController {
    //    http://localhost:8080/appraisal/getAll
    @Autowired
    AppraisalService appraisalService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Appraisal> getAllAppraisals() {

        return appraisalService.getAllAppraisals();
    }
    @GetMapping(value = "getById")
    public Appraisal getAppraisalById(@RequestParam Long id) {

        return appraisalService.getAppraisalById(id);
    }
}
