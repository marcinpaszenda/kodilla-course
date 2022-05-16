package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop extends Shop {

    @Override
    public void process(Order order) throws OutOfStockException {
        super.process(order);
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
