package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Shop {

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

        Map<String, Integer> glutenFreeShopProductList = new HashMap<>();
        glutenFreeShopProductList.put("Water", 25);
        glutenFreeShopProductList.put("Salt", 21);
        glutenFreeShopProductList.put("Orange juice", 12);
        glutenFreeShopProductList.put("Flower", 33);
        glutenFreeShopProductList.put("Tomato", 5);
        glutenFreeShopProductList.put("Cheese", 44);


        return glutenFreeShopProductList;
    }
}
