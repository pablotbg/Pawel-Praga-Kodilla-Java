package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class OrderRequest {

    private User user;
    private Map<String, Integer> products;

    public OrderRequest(final User user, final Map<String, Integer> products) {
        this.user = user;
        this.products = products;
    }

    public User getUser() {
        return user;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }
}
