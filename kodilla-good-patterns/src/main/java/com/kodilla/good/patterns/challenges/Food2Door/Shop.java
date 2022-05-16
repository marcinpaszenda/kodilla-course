package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;


abstract class Shop {

    public void process(Order order) throws OutOfStockException {

         for (String product : order.getOrderProducts().keySet()) {
             if (order.getOrderProducts().get(product) <= (productList().get(product))) {

             } else if (productList().containsKey(product) && order.getOrderProducts().get(product) > productList().get(product)) {
                 throw new OutOfStockException("Sorry, we don't have enough " + product + ". The current stock status is: " + productList().get(product));
             } else {
                 System.out.println(product + "is unavailable.");
             }
         }

        System.out.println(order.getOrderProducts());
        System.out.println("Client address: " + order.getClientAddress());

    }

    public abstract Map<String, Integer> productList();
}





