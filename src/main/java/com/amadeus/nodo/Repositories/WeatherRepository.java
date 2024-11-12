package com.amadeus.nodo.Repositories;

import com.amadeus.nodo.Models.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherEntity, Integer> {
}
