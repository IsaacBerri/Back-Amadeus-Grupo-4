package com.amadeus.nodo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;

@Data
@Entity
public class WeatherEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private int id;
        @Getter
        private String name;

        public WeatherEntity(String name) {
                this.name = name;
        }
        public WeatherEntity() {}
}
