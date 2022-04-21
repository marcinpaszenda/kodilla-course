package com.kodilla.good.patterns.challenges.store;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("adamkowalski", "Adam", "Kowalski", "adamkowalski@gmail.com");
        Product product = new Product("tshirt", 2, 39.99);

        return new OrderRequest(user, product);

    }
}
