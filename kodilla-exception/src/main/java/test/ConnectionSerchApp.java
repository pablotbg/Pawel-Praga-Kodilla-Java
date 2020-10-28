package test;

public class ConnectionSerchApp {
    public static void main(String[] args) {
        FlightBoard flightBoard = new FlightBoard();

        Flight firstConnect = new Flight("Warsaw", "London");
        try {
            flightBoard.findFlight(firstConnect);
            System.out.println("Is connect. You can fly.");
        } catch (RouteNotFoundException e) {
            System.out.println("Try find another flight connecting.");
        }

        Flight secondConnect = new Flight("Warsaw", "Paris");
        try {
            flightBoard.findFlight(secondConnect);
            System.out.println("Is connect. You can fly.");
        } catch (RouteNotFoundException e) {
            System.out.println("Try find another flight connecting.");
        }
    }
}
