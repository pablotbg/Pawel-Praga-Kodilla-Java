package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class GlutenFreeShopOrderService implements OrderService {
    @Override
    public boolean process(User user, Map<String, Integer> productNoGluten) {
        System.out.println("Order food no gluten.");
        return true;
    }
}
