package com.gomo.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "minPeople")
    private int minPeople;
    @Column(name = "maxPeople")
    private int maxPeople;
    @Column(name = "location")
    private String location;
    @Column(name = "startingAt")
    private String startingAt;

    public Event() {
    }

    public Event(String name, int minPeople, int maxPeople, String location, String startingAt) {
        this.name = name;
        this.minPeople = minPeople;
        this.maxPeople = maxPeople;
        this.location = location;
        this.startingAt = startingAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMinPeople() {
        return minPeople;
    }

    public void setMinPeople(int minPeople) {
        this.minPeople = minPeople;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartingAt() {
        return startingAt;
    }

    public void setStartingAt(String startingAt) {
        this.startingAt = startingAt;
    }
}
