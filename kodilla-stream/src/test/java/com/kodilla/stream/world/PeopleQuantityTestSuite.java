package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeopleQuantityTestSuite {

    @Test
    void testGetPeopleQuantity() {

        //Given
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country france = new Country("France", new BigDecimal("70000000"));
        Country china = new Country("China", new BigDecimal("1200000000"));
        Country india = new Country("India", new BigDecimal("1000000000"));
        Country brazil = new Country("Brazil", new BigDecimal("200000000"));
        Country argentina = new Country("Argentina", new BigDecimal("40000000"));

        List<Country> europeanCountries = new ArrayList<>();
        europeanCountries.add(poland);
        europeanCountries.add(france);

        List<Country> asianCountries = new ArrayList<>();
        asianCountries.add(china);
        asianCountries.add(india);

        List<Country> southAmericanContries = new ArrayList<>();
        southAmericanContries.add(brazil);
        southAmericanContries.add(argentina);

        Continent europe = new Continent("Europe", europeanCountries);
        Continent asia = new Continent("Asia", asianCountries);
        Continent southAmerica = new Continent("South America", southAmericanContries);

        List<Continent> continents = new ArrayList<>();
        continents.add(europe);
        continents.add(asia);
        continents.add(southAmerica);

        World world = new World(continents);

        //When
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expectedResult = new BigDecimal("2548000000");
        //Then
        assertEquals(expectedResult, result);
    }
}
