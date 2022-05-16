package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop extends Shop {

    @Override
    public void process(Order order) throws OutOfStockException {
        super.process(order);
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
