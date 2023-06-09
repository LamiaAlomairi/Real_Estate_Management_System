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
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double price;
    String dateSigned;

    @ManyToOne
    @JoinColumn(name = "property_id", referencedColumnName = "id")
    Property property;

    @ManyToOne
    @JoinColumn(name = "listing_id", referencedColumnName = "id")
    Listing listing;

    @ManyToOne
    @JoinColumn(name = "buyer_id", referencedColumnName = "id")
    Buyer buyer;

    @ManyToOne
    @JoinColumn(name = "seller_id", referencedColumnName = "id")
    Seller seller;

    @OneToMany(mappedBy = "contract")
    @JsonIgnore
    private List<Payment> payments;
}
