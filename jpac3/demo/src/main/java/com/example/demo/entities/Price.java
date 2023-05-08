package com.example.demo.entities;

import com.example.demo.entities.enums.Currency;
import jakarta.persistence.*;

/**
 * Created by Admin on 5/8/2023
 *
 * @author : Admin
 * @date : 5/8/2023
 * @project : jpac3
 */
@Entity
@Table(name = "prices")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;
    @Enumerated(EnumType.STRING)
    private Currency currency;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
