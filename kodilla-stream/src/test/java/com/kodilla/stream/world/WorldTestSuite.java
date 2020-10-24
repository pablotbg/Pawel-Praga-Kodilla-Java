package com.kodilla.stream.world;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given

        //Europe
        List<Country> countryInEurope = new ArrayList<>();
        Continent continentFirst = new Continent("Europe");
        Country countryOne = new Country("Poland", new BigDecimal("38000000"));
        Country countryTwo = new Country("France", new BigDecimal("102000000"));
        Country countryThree = new Country("Italu", new BigDecimal("72000000"));
        countryInEurope.add(countryOne);
        countryInEurope.add(countryTwo);
        countryInEurope.add(countryThree);
        continentFirst.addCountry(countryOne);
        continentFirst.addCountry(countryOne);
        continentFirst.addCountry(countryThree);

        //Asia
        List<Country> countryInAsia = new ArrayList<>();
        Continent continentSecond = new Continent("Asia");
        Country countryFour = new Country("China", new BigDecimal("2000000000"));
        Country countryFive = new Country("Japan", new BigDecimal("179000000"));
        Country countrySix = new Country("India", new BigDecimal("1500000000"));
        countryInAsia.add(countryFour);
        countryInAsia.add(countryFive);
        countryInAsia.add(countrySix);
        continentSecond.addCountry(countryFour);
        continentSecond.addCountry(countryFive);
        continentSecond.addCountry(countrySix);

        //North America
        List<Country> countryInAmerica = new ArrayList<>();
        Continent continentThird = new Continent("North America");
        Country countrySeven = new Country("Mexico", new BigDecimal("135000000"));
        Country countryEight = new Country("United States", new BigDecimal("283000000"));
        Country countryNine = new Country("Canada", new BigDecimal("98000000"));
        countryInAmerica.add(countrySeven);
        countryInAmerica.add(countryEight);
        countryInAmerica.add(countryNine);
        continentThird.addCountry(countrySeven);
        continentThird.addCountry(countryEight);
        continentThird.addCountry(countryNine);

        //World
        World world = new World();
        Continent continent1 = new Continent("Europe", countryInEurope);
        Continent continent2 = new Continent("Asia", countryInAsia);
        Continent continent3 = new Continent("North America", countryInAmerica);
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("4407000000");

        //Then
        Assertions.assertEquals(expected, totalPeople);
    }
}
