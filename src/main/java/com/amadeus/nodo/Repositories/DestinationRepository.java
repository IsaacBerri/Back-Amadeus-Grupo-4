package com.amadeus.nodo.Repositories;

import com.amadeus.nodo.Models.DestinationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends JpaRepository<DestinationEntity, Integer> {
}
