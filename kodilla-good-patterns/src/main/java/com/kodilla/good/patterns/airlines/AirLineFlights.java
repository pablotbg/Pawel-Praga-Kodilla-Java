package com.kodilla.good.patterns.airlines;

public class AirLineFlights {

    private final String cityDeparture;
    private final String cityArrival;

    public AirLineFlights(final String cityDeparture, final String cityArrival) {
        this.cityArrival = cityArrival;
        this.cityDeparture = cityDeparture;
    }

    public String getCityArrival() {
        return cityArrival;
    }

    public String getCityDeparture() {
        return cityDeparture;
    }

    @Override
    public String toString() {
        return "AirLine Timetable: " + "from " + cityDeparture + " to " + cityArrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirLineFlights that = (AirLineFlights) o;
        if (!getCityDeparture().equals(that.getCityDeparture())) return false;
        return getCityArrival().equals(that.getCityArrival());
    }

    @Override
    public int hashCode() {
        int result = getCityDeparture().hashCode();
        result = 31 * result + getCityArrival().hashCode();
        return result;
    }
}
