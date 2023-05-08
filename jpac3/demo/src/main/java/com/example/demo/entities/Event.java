package com.example.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

/**
 * Created by Admin on 5/8/2023
 *
 * @author : Admin
 * @date : 5/8/2023
 * @project : jpac3
 */
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "event_time")
    private ZonedDateTime eventTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ZonedDateTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(ZonedDateTime eventTime) {
        this.eventTime = eventTime;
    }
}
