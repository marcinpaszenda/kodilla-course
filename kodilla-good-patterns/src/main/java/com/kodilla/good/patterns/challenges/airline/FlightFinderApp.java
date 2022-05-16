package com.kodilla.good.patterns.challenges.airline;

public class FlightFinderApp {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        flightFinder.findFlightFrom("Olsztyn");
        flightFinder.findFlightTo("Warszawa");
        flightFinder.findFlightVia("Szczecin", "Rzeszów");

    }
}
