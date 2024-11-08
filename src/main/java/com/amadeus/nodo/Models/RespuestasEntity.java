package com.amadeus.nodo.Models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class RespuestasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @OneToMany
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @OneToMany
    @JoinColumn(name = "destination_id")
    private DestinationEntity destination;

    @OneToMany
    @JoinColumn(name = "weather_id")
    private WeatherEntity weather;

    @OneToMany
    @JoinColumn(name = "activity_id")
    private ActivityEntity  activity;

    //

    @OneToMany
    @JoinColumn(name = "age_id")
    private AgeEntity age;

    @OneToMany
    @JoinColumn(name = "travel_id")
    private TravelEntity travel;
}
