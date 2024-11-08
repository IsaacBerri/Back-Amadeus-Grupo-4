package com.amadeus.nodo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;


@Data
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Getter
    private String name;
    private String email;

    public UserEntity(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public UserEntity(){

    }

}
