package com.example.jpac1.entites;

import jakarta.persistence.*;


@Entity
public class Product {
    @Id
    @TableGenerator(name = "key_generator", table = "key_generator",
            pkColumnName = "key_name", pkColumnValue = "product_sequence",
            valueColumnName = "key_value", allocationSize = 20)
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "key_generator")
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
