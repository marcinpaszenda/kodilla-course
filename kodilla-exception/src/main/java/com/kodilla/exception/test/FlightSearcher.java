package com.kodilla.exception.test;

public class FlightSearcher {

    public static void main(String[] args) {

        Flight flight1 = new Flight("London", "Paris");
        Flight flight2 = new Flight("Madrid", "Rome");
        Flight flight3 = new Flight("Oslo", "Prague");

        try {
            System.out.println("\nSearching flight: " + flight1);
            searchFlight.findFlight(flight1);

            System.out.println("\nSearching flight: " + flight2);
            searchFlight.findFlight(flight2);

            System.out.println("\nSearching flight: " + flight3);
            searchFlight.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("\nSomething went wrong: " + e);
        } finally {
            System.out.println("\nThank you for choosing our airlines");
        }
    }
}
