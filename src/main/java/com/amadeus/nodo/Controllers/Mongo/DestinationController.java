package com.amadeus.nodo.Controllers.Mongo;

import com.amadeus.nodo.Services.Mongo.DestinationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DestinationController {

    @Autowired
    private DestinationsService destinationsService;

    /*
    @GetMapping("/Destination")
    public DestinationsDTO findAll(@RequestBody DestinationDTO2 dto2){
        return destinationsService.find(dto2);
    }*/

}
