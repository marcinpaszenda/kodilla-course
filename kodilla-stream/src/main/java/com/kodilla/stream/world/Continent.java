package com.kodilla.stream.world;

import java.util.List;

public final class Continent {

    private final String continent;
    private final List<Country> countryList;

    public Continent(final String continent, final List<Country> countryList) {
        this.continent = continent;
        this.countryList = countryList;
    }

    public String getContinent() {
        return continent;
    }

    public List<Country> getCountryList() {
        return countryList;
    }


}
