package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Map<String, Integer> productFruits = new HashMap<>();
        productFruits.put("Apple", 50);
        productFruits.put("Pear", 25);
        productFruits.put("Plum", 10);
        productFruits.put("Strawberry", 10);
        productFruits.put("Cherry", 15);

        User healthyShop = new User("HealthyShop", "Wólka Mała", productFruits);

        Map<String, Integer> orderProductFruits = new HashMap<>();
        orderProductFruits.put("Plum", 2);
        orderProductFruits.put("Pear", 3);

        return new OrderRequest(healthyShop, orderProductFruits);
    }
}
