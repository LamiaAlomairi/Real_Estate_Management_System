package com.Real_Estate_Management_System.Real_Estate_Management_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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

}
