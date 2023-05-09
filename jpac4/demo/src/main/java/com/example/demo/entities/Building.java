package com.example.demo.entities;

import com.example.demo.entities.embeddables.BuildingPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

/**
 * Created by Admin on 5/9/2023
 *
 * @author : Admin
 * @date : 5/9/2023
 * @project : jpac4
 */
@Entity
public class Building {
    @EmbeddedId
    private BuildingPK id;
    private String name;

    public BuildingPK getId() {
        return id;
    }

    public void setId(BuildingPK id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
