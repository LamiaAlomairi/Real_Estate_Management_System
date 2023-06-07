package com.Real_Estate_Management_System.Real_Estate_Management_System.Repositories;

import com.Real_Estate_Management_System.Real_Estate_Management_System.Models.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}
