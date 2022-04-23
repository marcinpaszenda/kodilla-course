package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class OrderRetriever {

    public Order retrieve() {

        Map<String, Integer> order001 = new HashMap<>();
        order001.put("Milk", 19);
        order001.put("Carrot", 6);
        order001.put("Apple", 1);
        order001.put("Pasta", 2);

        return new Order(order001, "ul. Kościuszki 3, 44-200 Rybnik");
    }
}
