package com.Real_Estate_Management_System.Real_Estate_Management_System.Controllers;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Property;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "property")
public class PropertyController {
    //    http://localhost:8080/property/getAll
    @Autowired
    PropertyService propertyService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Property> getAllProperties() {

        return propertyService.getAllProperties();
    }
    @GetMapping(value = "getById")
    public Property getPropertyById(@RequestParam Long id) {

        return propertyService.getPropertyById(id);
    }
}
