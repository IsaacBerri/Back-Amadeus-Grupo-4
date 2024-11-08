package com.amadeus.nodo.Repositories;

import com.amadeus.nodo.Models.ActivityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<ActivityEntity, Integer> {
}
