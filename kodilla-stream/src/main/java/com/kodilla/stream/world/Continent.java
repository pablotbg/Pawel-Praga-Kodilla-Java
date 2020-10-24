package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String continentName;
    private List<Country> countries = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public Continent(final String continentName, List<Country> countries) {
            this.continentName = continentName;
            this.countries = countries;
        }

        public void addCountry (Country country){
            countries.add(country);
        }

        public String getContinentName () {
            return continentName;
        }

        public List<Country> getCountries () {
            return countries;
        }
}
