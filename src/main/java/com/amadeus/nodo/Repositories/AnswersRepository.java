package com.amadeus.nodo.Repositories;

import com.amadeus.nodo.Models.AnswersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswersRepository extends JpaRepository<AnswersEntity, Integer> {
}
