package com.amadeus.nodo.Repositories;

import com.amadeus.nodo.Models.HostingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostingRepository extends JpaRepository<HostingEntity, Integer> {
}

//  Dell this line