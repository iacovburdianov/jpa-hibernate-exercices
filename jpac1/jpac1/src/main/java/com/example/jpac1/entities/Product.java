package com.example.jpac1.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    private Long id;

    @Basic(optional = false)
    private String name;
    private Double price;
    private LocalDate expirationDate;
}
