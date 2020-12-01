package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class HealthyShopOrderService implements OrderService {

    @Override
    public boolean process(User user, Map<String, Integer> productFruits) {
        System.out.println("Process. Order fresh fruits.");
        return true;
    }
}
