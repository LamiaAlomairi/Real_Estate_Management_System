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
@Table(name = "listing")
public class Listing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long listing_id;
    Long price;
    String date_listed;

    @ManyToOne
    @JoinColumn(name = "property_id", referencedColumnName = "property_id")
    Property property;

    @ManyToOne
    @JoinColumn(name = "agent_id", referencedColumnName = "agent_id")
    Agent agent;

    @ManyToOne
    @JoinColumn(name = "seller_id", referencedColumnName = "seller_id")
    Seller seller;

    @OneToMany(mappedBy = "listing")
    @JsonIgnore
    private List<Inspection> inspections;

    @OneToMany(mappedBy = "listing")
    @JsonIgnore
    private List<Contract> contracts;
}
