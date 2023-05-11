package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Inspection;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.Inspection_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "inspection")
public class Inspection_Controller {
    //    http://localhost:8080/inspection/getAll
    @Autowired
    Inspection_Service inspection_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Inspection> getAllInspections() {

        return inspection_service.getAllInspections();
    }
    @GetMapping(value = "getById")
    public Inspection getInspectionById(@RequestParam Long id) {

        return inspection_service.getInspectionById(id);
    }
}
