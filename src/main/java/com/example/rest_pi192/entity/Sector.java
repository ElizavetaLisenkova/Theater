package com.example.rest_pi192.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "sector")
public class Sector {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "hall_id")
    private String hallId;

    @Column(name = "seats_number")
    private Integer seatsNumber;
}
