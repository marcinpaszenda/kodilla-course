package com.kodilla.good.patterns.challenges.store;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(User user, Product product) {

        System.out.println("User: " + user.getUserName() +
                "\nOrdered product: " + product.getProductName() +
                "\nPrice: " + product.getPrice() +
                "\nQuantity: " + product.getQuantity() +
                "\nSummary: " + (product.getPrice() * product.getQuantity()));

        return true;
    }





}
