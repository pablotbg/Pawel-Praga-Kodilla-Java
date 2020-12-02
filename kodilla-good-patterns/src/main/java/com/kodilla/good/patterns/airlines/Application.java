package com.kodilla.good.patterns.airlines;

public class Application {
    public static void main(String[] args) {

        AirLineFlights newFlight = new AirLineFlights("Wrocław", "Kraków");
        AirLineFlightsService airLineFlightsService = new AirLineFlightsService();

        String checkFly = airLineFlightsService.checkOrFlightExist(newFlight);
        System.out.println(checkFly);

        String checkConnecting = airLineFlightsService.checkFlightWithConnecting(newFlight);
        System.out.println(checkConnecting);

        System.out.println("\nFlights from " + newFlight.getCityDeparture() + ":");
        airLineFlightsService.searchFromCity(newFlight.getCityDeparture()).forEach(System.out::println);

        System.out.println("\nFlights to " + newFlight.getCityArrival() + ":");
        airLineFlightsService.searchToCity(newFlight.getCityArrival()).forEach(System.out::println);
    }
}
