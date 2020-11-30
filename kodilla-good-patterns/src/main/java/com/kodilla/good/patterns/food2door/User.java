package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class User {

    private String name;
    private String address;
    private Map<String, Integer> products;

    public User(final String name, final String address, final Map<String, Integer> products) {
        this.name = name;
        this.address = address;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Map<String, Integer> getProducts() {
        return products;
    }
}
