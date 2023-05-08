package com.example.jpac1.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.util.UUID;

/**
 * Created by Admin on 5/7/2023
 *
 * @author : Admin
 * @date : 5/7/2023
 * @project : jpac2
 */
@Entity
public class Event {
    @Id
    @GenericGenerator(
            name = "uuid",
            strategy = "org.hibernate.id.UUIDHexGenerator",
            parameters = @Parameter(name = "separator", value = "--")
    )
    @GeneratedValue(generator = "uuid")
    private String id;
    private String description;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
