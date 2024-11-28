package com.amadeus.nodo.Models.Mongo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "respuestas")
public class DestinationsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String _id;
    private String typeDestiny;
    private String weather;
    private String activity;
    private String hosting;
    private String duration;
    private String age;
    private Destinity destinationAmerica;
    private Destinity destinationEuropa;

    @JsonSerialize
    @Getter
    @Setter
    public static class Destinity {
        private String site;
        private String country;
        private String language;
        private String unmissablePlace;
        private String typicalFood;
    }
}
