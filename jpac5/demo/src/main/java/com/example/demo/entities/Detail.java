package com.example.demo.entities;

import jakarta.persistence.*;

/**
 * Created by Admin on 5/9/2023
 *
 * @author : Admin
 * @date : 5/9/2023
 * @project : jpac5
 */
@Entity
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long kcal;

    @JoinColumn(name = "product_id")
    @OneToOne
    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getKcal() {
        return kcal;
    }

    public void setKcal(Long kcal) {
        this.kcal = kcal;
    }
}
