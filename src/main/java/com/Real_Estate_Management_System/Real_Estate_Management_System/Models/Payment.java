package com.Real_Estate_Management_System.Real_Estate_Management_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double amount;
    String datePaid;

    @ManyToOne
    @JoinColumn(name = "contract_id", referencedColumnName = "id")
    Contract contract;

    @ManyToOne
    @JoinColumn(name = "buyer_id", referencedColumnName = "id")
    Buyer buyer;

    @ManyToOne
    @JoinColumn(name = "property_id", referencedColumnName = "id")
    Property property;
}
