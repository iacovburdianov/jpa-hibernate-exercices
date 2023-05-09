package com.example.demo.entities.embeddables;

import jakarta.persistence.Embeddable;

/**
 * Created by Admin on 5/9/2023
 *
 * @author : Admin
 * @date : 5/9/2023
 * @project : jpac4
 */
@Embeddable
public class BuildingPK {
    private Long number;
    private String code;

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
