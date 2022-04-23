package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class Order {

    private Map<String, Integer> orderProducts;
    private String clientAddress;

    public Order(Map<String, Integer> orderProducts, String clientAddress) {
        this.orderProducts = orderProducts;
        this.clientAddress = clientAddress;
    }

    public Map<String, Integer> getOrderProducts() {
        return orderProducts;
    }

    public String getClientAddress() {
        return clientAddress;
    }
}
