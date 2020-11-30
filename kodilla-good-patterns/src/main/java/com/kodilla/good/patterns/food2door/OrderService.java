package com.kodilla.good.patterns.food2door;

import java.util.Map;

public interface OrderService {

    boolean process(User user, Map<String, Integer> products);
}
