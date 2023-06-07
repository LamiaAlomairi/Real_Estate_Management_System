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
    Long id;
    String dateInspected;
    String report;

    @ManyToOne
    @JoinColumn(name = "listing_id", referencedColumnName = "id")
    Listing listing;

    @ManyToOne
    @JoinColumn(name = "property_id", referencedColumnName = "id")
    Property property;

}
