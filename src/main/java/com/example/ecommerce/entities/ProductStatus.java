package com.example.ecommerce.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "productStatuses")
@Getter
@Setter
public class ProductStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String name;

    @OneToMany(mappedBy = "productStatus", cascade = CascadeType.ALL)
    @JsonBackReference
    List<Product> products;

}
