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
@Table(name = "buyer")
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long buyer_id;
    String name;
    String email;
    Long phone;
    String budget;

    @ManyToOne
    @JoinColumn(name = "agent_id", referencedColumnName = "agent_id")
    Agent agent;

    @OneToMany(mappedBy = "buyer")
    @JsonIgnore
    private List<Payment> payments;

    @OneToMany(mappedBy = "buyer")
    @JsonIgnore
    private List<Contract> contracts;
}
