package com.Real_Estate_Management_System.Real_Estate_Management_System.Services;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Inspection;
import com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories.Inspection_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Inspection_Service {
    @Autowired
    Inspection_Repository inspection_repository;
    public List<Inspection> getAllInspections() {

        return inspection_repository.findAll();
    }

    public Inspection getInspectionById(Long id) {

        return inspection_repository.findById(id).get();
    }
}
