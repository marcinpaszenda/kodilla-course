package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Shop {

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

        Map<String, Integer> extraFoodShopProductList = new HashMap<>();
        extraFoodShopProductList.put("Onion", 20);
        extraFoodShopProductList.put("Mango", 30);
        extraFoodShopProductList.put("Milk", 20);
        extraFoodShopProductList.put("Carrot", 10);
        extraFoodShopProductList.put("Apple", 9);
        extraFoodShopProductList.put("Pasta", 20);

        return extraFoodShopProductList;
    }
}
