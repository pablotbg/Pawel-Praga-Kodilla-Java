package com.kodilla.good.patterns.challenges;

import java.util.Map;

public interface OrderRepository {

    Map<Integer, ProductOrderService> createNewOrder();
}
