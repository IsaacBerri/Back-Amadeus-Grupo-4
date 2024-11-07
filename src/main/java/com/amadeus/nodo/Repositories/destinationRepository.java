package com.amadeus.nodo.Repositories;

import com.amadeus.nodo.Models.destinationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface destinationRepository extends JpaRepository<destinationEntity, Integer> {
}
