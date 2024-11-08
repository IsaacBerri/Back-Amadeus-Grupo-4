package com.amadeus.nodo.Models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@Entity

public class TravelEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Integer id;
    public String name;

    public TravelEntity(String name) {
        this.name = name;
    }

    public TravelEntity() {
    }
}