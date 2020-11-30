package com.kodilla.good.patterns.food2door;

import java.util.Map;

public class ExtraFoodShopOrderService implements OrderService {

    @Override
    public boolean process(User user, Map<String, Integer> productDelicacies) {
        System.out.println("Order amazing delicacies.");
        return true;
    }
}
