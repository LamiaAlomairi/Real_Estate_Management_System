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
@Table(name = "seller")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String email;
    Long phone;
    Double askingPrice;

    @ManyToOne
    @JoinColumn(name = "agent_id", referencedColumnName = "id")
    Agent agent;

    @OneToMany(mappedBy = "seller")
    @JsonIgnore
    private List<Listing> listings;

    @OneToMany(mappedBy = "seller")
    @JsonIgnore
    private List<Contract> contracts;
}
