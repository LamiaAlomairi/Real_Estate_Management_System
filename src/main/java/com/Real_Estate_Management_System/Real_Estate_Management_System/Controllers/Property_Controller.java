package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Property;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.Property_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "property")
public class Property_Controller {
    //    http://localhost:8080/property/getAll
    @Autowired
    Property_Service property_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Property> getAllProperties() {

        return property_service.getAllProperties();
    }
    @GetMapping(value = "getById")
    public Property getPropertyById(@RequestParam Long id) {

        return property_service.getPropertyById(id);
    }
}
