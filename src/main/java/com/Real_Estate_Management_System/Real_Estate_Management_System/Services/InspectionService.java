package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Inspection;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.InspectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InspectionService {
    @Autowired
    InspectionRepository inspectionRepository;
    public List<Inspection> getAllInspections() {

        return inspectionRepository.findAll();
    }

    public Inspection getInspectionById(Long id) {

        return inspectionRepository.findById(id).get();
    }
}
