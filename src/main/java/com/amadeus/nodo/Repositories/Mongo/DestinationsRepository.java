package com.amadeus.nodo.Repositories.Mongo;

import com.amadeus.nodo.Contracts.Mongo.DestinationsDTO;
import com.amadeus.nodo.Models.Mongo.DestinationsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationsRepository extends MongoRepository<DestinationsEntity, String> {
    @Query(value = "{ 'typeDestiny': ?0, 'weather': ?1, 'activity': ?2, 'hosting': ?3, 'duration': ?4, 'age': ?5 }", fields = "{'destinationAmerica': 1, 'destinationEuropa': 1, '_id': 0}")
    DestinationsDTO findDestinations(String destination, String weather, String activity, String hosting, String travel, String age);
}
