package com.amadeus.nodo.Models;

import jakarta.persistence.Entity;

@Entity
public class DestinationEntity {
    private int id;
    private String name;

    public DestinationEntity(String name) {
        this.name = name;
    }
    public DestinationEntity() {}
}
