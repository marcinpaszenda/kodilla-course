package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop extends Shop {

    @Override
    public void process(Order order) throws OutOfStockException {
        super.process(order);
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
