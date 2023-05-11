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
    Long payment_id;
    Double amount;
    String date_paid;

    @ManyToOne
    @JoinColumn(name = "contract_id", referencedColumnName = "contract_id")
    Contract contract;

    @ManyToOne
    @JoinColumn(name = "buyer_id", referencedColumnName = "buyer_id")
    Buyer buyer;

    @ManyToOne
    @JoinColumn(name = "property_id", referencedColumnName = "property_id")
    Property property;
}
