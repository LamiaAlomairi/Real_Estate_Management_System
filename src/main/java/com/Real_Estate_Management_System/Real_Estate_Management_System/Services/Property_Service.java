package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Property;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.Property_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Property_Service {
    @Autowired
    Property_Repository property_repository;
    public List<Property> getAllProperties() {

        return property_repository.findAll();
    }

    public Property getPropertyById(Long id) {

        return property_repository.findById(id).get();
    }
}
