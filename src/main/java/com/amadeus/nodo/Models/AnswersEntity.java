package com.amadeus.nodo.Models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AnswersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @Getter
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "destination_id")
    @Getter
    private DestinationEntity destination;

    @ManyToOne
    @JoinColumn(name = "weather_id")
    @Getter
    private WeatherEntity weather;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    @Getter
    private ActivityEntity activity;

    @ManyToOne
    @JoinColumn(name = "hosting_id")
    @Getter
    private HostingEntity hosting;

    @ManyToOne
    @JoinColumn(name = "age_id")
    @Getter
    private AgeEntity age;

    @ManyToOne
    @JoinColumn(name = "travel_id")
    @Getter
    private TravelEntity travel;
}
