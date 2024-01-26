package com.example.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(name = "addresses")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column
    private String street;

    @Column
    private String street1;

    @Column
    private String street2;

    @Column
    private String neighborhood;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String country;

    @Column
    private String zipcode;

    @Column
    private String externalNumber;

    @Column
    private String internalNumber;

    @Column
    private String reference;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;





}
