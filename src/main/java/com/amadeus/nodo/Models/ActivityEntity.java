package com.amadeus.nodo.Models;

import jakarta.persistence.Entity;

@Entity
public class ActivityEntity {
        private int id;
        private String name;

        public ActivityEntity(String name) {
                this.name = name;
        }

        public ActivityEntity() {}
}
