package com.amadeus.nodo.Services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.function.Function;

@Service
public class GenericEntityService {
    public static <T> T findOrCreate(
            JpaRepository<T,Integer> repository,
            Function<T, Boolean> existsPredicate,
            T entity
    ){
        Optional<T> existingEntity = repository.findAll().stream().filter(existsPredicate::apply).findFirst();
        return existingEntity.orElseGet(()->repository.save(entity));
    }

    public static <T> T findOrCreate(
            JpaRepository<T,Integer> repository,
            Function<T, Boolean> existsPredicate,
            Function<T, Boolean> existsPredicate2,
            T entity
    ){
        Optional<T> existingEntity = repository.findAll().stream().filter(e -> existsPredicate.apply(e) && existsPredicate2.apply(e)).findFirst();
        return existingEntity.orElseGet(()->repository.save(entity));
    }
}
