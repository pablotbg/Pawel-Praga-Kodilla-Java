package com.kodilla.good.patterns.airlines;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirLineFlightsService {

    final List<AirLineFlights> flights = new ArrayList<>();

    public AirLineFlightsService() {
        this.flights.add(new AirLineFlights("Kraków", "Warszawa"));
        this.flights.add(new AirLineFlights("Kraków", "Wrocław"));
        this.flights.add(new AirLineFlights("Kraków", "Gdańsk"));
        this.flights.add(new AirLineFlights("Wrocław", "Gdańsk"));
        this.flights.add(new AirLineFlights("Wrocław", "Warszawa"));
        this.flights.add(new AirLineFlights("Warszawa", "Gdańsk"));
        this.flights.add(new AirLineFlights("Warszawa", "Kraków"));
        this.flights.add(new AirLineFlights("Warszawa", "Wrocław"));
        this.flights.add(new AirLineFlights("Gdańsk", "Warszawa"));
        this.flights.add(new AirLineFlights("Gdańsk", "Kraków"));
     }

     public String checkOrFlightExist(AirLineFlights airLineFlights) {
        boolean orFlightExist = flights.contains(airLineFlights);

        if(orFlightExist) {
            return "Flight is possibly. " + airLineFlights;
        } else {
            return "Flight not exist. You try to fly choosing a connecting city";
        }
     }

    public String checkFlightWithConnecting(AirLineFlights airLineFlights) {

        String cityDeparture = airLineFlights.getCityDeparture();
        String cityArrival = airLineFlights.getCityArrival();

        ArrayList<AirLineFlights> cityDepartureFlights = searchFromCity(cityDeparture);
        ArrayList<AirLineFlights> cityArrivalFlights = searchToCity(cityArrival);

        ArrayList<AirLineFlights> connectingFLightsFrom = cityDepartureFlights.stream()
                .filter(two -> cityArrivalFlights.stream()
                        .anyMatch(one -> one.getCityDeparture().equals(two.getCityArrival())))
                .collect(Collectors.toCollection(ArrayList::new));

        ArrayList<AirLineFlights> connectingFLightsTo = cityArrivalFlights.stream()
                .filter(two -> cityDepartureFlights.stream()
                        .anyMatch(one -> one.getCityArrival().equals(two.getCityDeparture())))
                .collect(Collectors.toCollection(ArrayList::new));

        String connectingFlights = Stream.of(connectingFLightsFrom, connectingFLightsTo)
                .flatMap(Collection::stream)
                .map(Object::toString)
                .collect(Collectors.joining(", "));

        if (connectingFLightsFrom.isEmpty() && connectingFLightsTo.isEmpty()) {
            return "\nConnecting flights is nit possibly";
        } else {
            return "\nConnecting flights: " + connectingFlights;
        }
    }

    public ArrayList<AirLineFlights> searchFromCity(String city) {
        return flights.stream()
                .filter(f -> f.getCityDeparture().equals(city))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<AirLineFlights> searchToCity(String city) {
        return flights.stream()
                .filter(f -> f.getCityArrival().equals(city))
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
