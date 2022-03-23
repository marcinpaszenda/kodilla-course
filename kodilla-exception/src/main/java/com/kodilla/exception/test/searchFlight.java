package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class searchFlight {

    public static void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();

        airports.put("London", true);
        airports.put("Paris", true);
        airports.put("Madrid", true);
        airports.put("Rome", false);
        airports.put("Vienna", true);
        airports.put("Prague", true);

        if((!airports.containsKey(flight.getDepartureAirport())) || (!airports.containsKey(flight.getArrivalAirport()))) {
            throw new RouteNotFoundException("This airport is not on the airport list.");
        } else {
            if(airports.get(flight.getDepartureAirport()) == false || airports.get(flight.getArrivalAirport()) == false) {
                System.out.println("Flight is not available.");
            } else {
                System.out.println("Flight is available.");
            }
        }
    }
}
