package com.amadeus.nodo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class ActivityEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private int id;
        @Getter
        private String name;

        public ActivityEntity(String name) {
                this.name = name;
        }

        public ActivityEntity() {}
}