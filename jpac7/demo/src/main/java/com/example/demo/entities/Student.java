package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.List;

/**
 * Created by Admin on 5/12/2023
 *
 * @author : Admin
 * @date : 5/12/2023
 * @project : jpac7
 */
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "students", cascade = CascadeType.PERSIST)
    private List<Profesor> profesors;


    public List<Profesor> getProfesors() {
        return profesors;
    }

    public void setProfesors(List<Profesor> profesors) {
        this.profesors = profesors;
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
}
