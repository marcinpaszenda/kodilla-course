package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Shop {

    @Override
    public void process(Order order) throws OutOfStockException {

        for (String product : order.getOrderProducts().keySet()) {
            if (order.getOrderProducts().get(product) <= productList().get(product)) {
                System.out.println("Ordered products: " + product + ", quantity: " + order.getOrderProducts().get(product));
            } else if (productList().containsKey(product) && order.getOrderProducts().get(product) > productList().get(product)) {
                throw new OutOfStockException("Sorry, we don't have enough " + product + ". The current stock status is: " + productList().get(product));
            } else {
                System.out.println(product + "is unavailable.");
            }
        }
        System.out.println("Client address: " + order.getClientAddress());
    }

    public Map<String, Integer> productList() {

        Map<String, Integer> healthyShopProductList = new HashMap<>();
        healthyShopProductList.put("Water", 25);
        healthyShopProductList.put("Salt", 21);
        healthyShopProductList.put("Orange juice", 12);
        healthyShopProductList.put("Flower", 33);
        healthyShopProductList.put("Tomato", 5);
        healthyShopProductList.put("Cheese", 44);


        return healthyShopProductList;
    }
}
