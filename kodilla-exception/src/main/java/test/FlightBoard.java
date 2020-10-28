package test;

import java.util.HashMap;
import java.util.Map;

public final class FlightBoard {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> cityFlightBoard = new HashMap<>();
        cityFlightBoard.put("Warsaw", true);
        cityFlightBoard.put("London", true);
        cityFlightBoard.put("Spain", true);
        cityFlightBoard.put("Rome", true);
        cityFlightBoard.put("Prague", true);

        String arrival = flight.getArrivalAirport();
        String departure = flight.getDepartureAirport();

        if (cityFlightBoard.containsKey(arrival) && cityFlightBoard.containsKey(departure)) {
            return cityFlightBoard.get(arrival) && cityFlightBoard.get(departure);
        } else {
            throw new RouteNotFoundException();
        }
    }
}
