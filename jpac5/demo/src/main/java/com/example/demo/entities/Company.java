package com.example.demo.entities;

import jakarta.persistence.*;

/**
 * Created by Admin on 5/9/2023
 *
 * @author : Admin
 * @date : 5/9/2023
 * @project : jpac5
 */
/*@Entity
@SecondaryTable(
        name = "address",
        pkJoinColumns = @PrimaryKeyJoinColumn(name = "company"))
@SecondaryTable(
        name = "miscellaneous",
        pkJoinColumns = @PrimaryKeyJoinColumn(name = "company"))*/
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(table = "address")
    private String street;
    @Column(table = "address")
    private String number;

    @Column(table = "miscellaneous")
    private String details;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
