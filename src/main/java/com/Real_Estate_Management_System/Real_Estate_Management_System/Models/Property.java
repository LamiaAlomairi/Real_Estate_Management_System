package com.Real_Estate_Management_System.Real_Estate_Management_System.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "property")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long property_id;
    String address;
    String type;
    Double price;
    Integer size;
    Integer number_of_bedrooms;
    Integer number_of_bathrooms;
    String description;

    @OneToMany(mappedBy = "property")
    @JsonIgnore
    private List<Listing> listings;

    @OneToMany(mappedBy = "property")
    @JsonIgnore
    private List<Appraisal> appraisals;

    @OneToMany(mappedBy = "property")
    @JsonIgnore
    private List<Inspection> inspections;

    @OneToMany(mappedBy = "property")
    @JsonIgnore
    private List<Contract> contracts;

    @OneToMany(mappedBy = "property")
    @JsonIgnore
    private List<Payment> payments;
}
