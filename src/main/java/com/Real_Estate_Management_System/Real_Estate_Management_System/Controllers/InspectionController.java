package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Inspection;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.InspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "inspection")
public class InspectionController {
    //    http://localhost:8080/inspection/getAll
    @Autowired
    InspectionService inspectionService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Inspection> getAllInspections() {

        return inspectionService.getAllInspections();
    }
    @GetMapping(value = "getById")
    public Inspection getInspectionById(@RequestParam Long id) {

        return inspectionService.getInspectionById(id);
    }
}
