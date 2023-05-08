package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

/**
 * Created by Admin on 5/8/2023
 *
 * @author : Admin
 * @date : 5/8/2023
 * @project : jpac3
 */
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "exp_date")
    private LocalDate expDate;


    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }
}
