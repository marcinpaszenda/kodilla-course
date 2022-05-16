package com.kodilla.good.patterns.challenges.Food2Door;

public class Food2DoorApplication {

    public static void main(String[] args) {


        OrderRetriever orderRetriever = new OrderRetriever();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();

        try {
            extraFoodShop.process(orderRetriever.retrieve());

        } catch (OutOfStockException message) {
            System.out.println("Something went wrong: " + message);
        }
    }
}
