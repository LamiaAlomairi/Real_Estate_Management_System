package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Property;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {
    @Autowired
    PropertyRepository propertyRepository;
    public List<Property> getAllProperties() {

        return propertyRepository.findAll();
    }

    public Property getPropertyById(Long id) {

        return propertyRepository.findById(id).get();
    }
}
