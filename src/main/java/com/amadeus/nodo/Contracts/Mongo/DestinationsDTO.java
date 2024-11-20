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
    public static class Destinity {
        private String site;
        private String country;

        public String getSite() {
            return site;
        }

        public void setSite(String site) {
            this.site = site;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }
    }
}
