package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class ProductOrderRepository implements OrderRepository {

    private Integer id;
    private ProductOrderService productOrderService;

    public ProductOrderRepository() {

    }

    public ProductOrderRepository(final Integer id, final ProductOrderService productOrderService) {
        this.id = id;
        this.productOrderService = productOrderService;
    }

    public Integer getId() {
        return id;
    }

    public Map<Integer, ProductOrderService> createNewOrder() {
        Map<Integer, ProductOrderService> orderList = new HashMap<>();
        orderList.put(getId(), productOrderService);
        return new HashMap<>(orderList);
    }
}
