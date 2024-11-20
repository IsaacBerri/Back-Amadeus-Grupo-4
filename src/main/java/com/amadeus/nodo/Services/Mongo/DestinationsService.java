package com.amadeus.nodo.Services.Mongo;

import com.amadeus.nodo.Contracts.AnswersDTO;
import com.amadeus.nodo.Contracts.Mongo.DestinationsDTO;
import com.amadeus.nodo.Repositories.Mongo.DestinationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinationsService {
    @Autowired
    private DestinationsRepository destinationsRepository;

    public DestinationsDTO find(AnswersDTO answersDTO){
        return destinationsRepository.findDestinations(answersDTO.getDestination(), answersDTO.getWeather(), answersDTO.getActivity(),
                answersDTO.getHosting(), answersDTO.getTravel(), answersDTO.getAge());
    }
}
