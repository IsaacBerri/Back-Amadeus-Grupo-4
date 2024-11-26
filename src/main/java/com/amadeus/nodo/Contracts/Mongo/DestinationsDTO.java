package com.amadeus.nodo.Contracts.Mongo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DestinationsDTO {
    private Destinity destinationAmerica;
    private Destinity destinationEuropa;

    @JsonSerialize
    @Getter
    @Setter
    public static class Destinity {
        private String site;
        private String country;
        private String language;
        private String unmissablePlace;
        private String typicalFood;
    }
}
