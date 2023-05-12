package com.example.demo.entities;

import jakarta.persistence.*;

/**
 * Created by Admin on 5/11/2023
 *
 * @author : Admin
 * @date : 5/11/2023
 * @project : jpac6
 */
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;



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
}
