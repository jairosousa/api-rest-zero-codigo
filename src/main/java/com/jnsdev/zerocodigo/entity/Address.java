package com.jnsdev.zerocodigo.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @Autor Jairo Nascimento
 * @Created 08/03/2026 - 13:05
 */
@Entity
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String city;
    private String state;
    private String zip;

    @ManyToOne
    private Customer customer;
}
