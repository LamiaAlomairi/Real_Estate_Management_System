package com.Real_Estate_Management_System.Real_Estate_Management_System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "appraisal")
public class Appraisal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long appraisal_id;
    String date_appraised;
    Integer value;

}
