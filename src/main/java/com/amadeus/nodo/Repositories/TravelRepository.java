package com.amadeus.nodo.Repositories;

import com.amadeus.nodo.Models.TravelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelRepository extends JpaRepository<TravelEntity, Integer> {

}
