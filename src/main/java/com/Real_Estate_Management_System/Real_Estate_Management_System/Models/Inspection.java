package com.Real_Estate_Management_System.Real_Estate_Management_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "inspection")
public class Inspection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long inspection_id;
    String date_inspected;
    String report;

    @ManyToOne
    @JoinColumn(name = "listing_id", referencedColumnName = "listing_id")
    Listing listing;

    @ManyToOne
    @JoinColumn(name = "property_id", referencedColumnName = "property_id")
    Property property;

}
