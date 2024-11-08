package com.amadeus.nodo.Repositories;

import com.amadeus.nodo.Models.RespuestasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestasRepository extends JpaRepository<RespuestasEntity, Integer> {
}
