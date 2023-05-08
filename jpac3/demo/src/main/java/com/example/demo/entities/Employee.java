package com.example.demo.entities;

import jakarta.persistence.*;

import java.util.Date;

/**
 * Created by Admin on 5/8/2023
 *
 * @author : Admin
 * @date : 5/8/2023
 * @project : jpac3
 */
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "emp_date")
    @Temporal(TemporalType.DATE)
    private Date empDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getEmpDate() {
        return empDate;
    }

    public void setEmpDate(Date empDate) {
        this.empDate = empDate;
    }
}
