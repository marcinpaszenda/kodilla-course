package com.kodilla.good.patterns.challenges.airline;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    public List<Flight> getFlights() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Gdańsk", "Kraków"));
        flights.add(new Flight("Rzeszów", "Szczecin"));
        flights.add((new Flight("Olsztyn", "Wrocław")));
        flights.add(new Flight("Katowice", "Warszawa"));
        flights.add(new Flight("Lublin", "Poznań"));

        return flights;
    }

    public List<Flight> findFlightFrom(String from) {
        List<Flight> result = getFlights().stream()
                .filter(f -> f.getDepartureAirport().equals(from))
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("We didn't find the flight. Try again.");
        } else {
            System.out.println("The following flights are available from the selected airport:");
            for (Flight flight : result) {
                System.out.println(flight.toString());
            }
        }
        return result;
    }

    public List<Flight> findFlightTo(String to) {
        List<Flight> result = getFlights().stream()
                .filter(f -> f.getArrivalAirport().equals(to))
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("We didn't find the flight. Try again.");
        } else {
            System.out.println("The following flights are available to the selected airport:");
            for (Flight flight : result) {
                System.out.println(flight.toString());
            }
        }
        return result;
    }

    public List<Flight> findFlightVia(String to, String via) {
        List<Flight> result = getFlights().stream()
                .filter(f -> f.getArrivalAirport().equals(to))
                .filter(f -> f.getDepartureAirport().equals(via))
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("We didn't find the flight. Try again.");
        } else {
            for (Flight flight : result) {
                System.out.println("There is available flights to " + flight.getArrivalAirport() + " via " + flight.getDepartureAirport());
            }
        }
        return result;
    }

}
