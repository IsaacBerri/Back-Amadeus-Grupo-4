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

          DestinationsDTO resultDestinations = destinationsRepository.findDestinations(answersDTO.getDestination(), answersDTO.getWeather(), answersDTO.getActivity(),
                answersDTO.getHosting(), answersDTO.getTravel(), answersDTO.getAge());

        if (resultDestinations == null){
            DestinationsDTO defaultDestinations = new DestinationsDTO();
            DestinationsDTO.Destinity destinity1 = new DestinationsDTO.Destinity();
            destinity1.setCountry("Polinesia Francesa");
            destinity1.setSite("Bora Bora");
            destinity1.setLanguage("Francés, Hahitiano");
            destinity1.setUnmissablePlace("Playa de Matira");
            destinity1.setTypicalFood("El pescado");
            defaultDestinations.setDestinationAmerica(destinity1);
            DestinationsDTO.Destinity destinity2 = new DestinationsDTO.Destinity();
            destinity2.setCountry("Emiratos Árabes");
            destinity2.setSite("Dubái");
            destinity2.setLanguage("Árabe");
            destinity2.setUnmissablePlace("Burj Khalifa");
            destinity2.setTypicalFood("Hummus");
            defaultDestinations.setDestinationEuropa(destinity2);
            return defaultDestinations;
        }

        return resultDestinations;
    }
}
