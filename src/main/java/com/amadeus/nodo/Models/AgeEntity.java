package com.amadeus.nodo.Models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity

public class AgeEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Integer id;
    public String name;

    public AgeEntity(String name) {
        this.name = name;
    }

    public AgeEntity() {
    }


}