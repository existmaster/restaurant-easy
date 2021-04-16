package edu.kosta.restaurantapi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Tablet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String location;

}
