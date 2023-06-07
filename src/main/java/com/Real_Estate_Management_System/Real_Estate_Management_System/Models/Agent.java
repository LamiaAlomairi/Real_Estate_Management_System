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
@Table(name = "agent")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String email;
    Long phone;
    Long licenseNumber;

    @OneToMany(mappedBy = "agent")
    @JsonIgnore
    private List<Listing> listings;

    @OneToMany(mappedBy = "agent")
    @JsonIgnore
    private List<Buyer> buyers;

    @OneToMany(mappedBy = "agent")
    @JsonIgnore
    private List<Seller> sellers;
}
