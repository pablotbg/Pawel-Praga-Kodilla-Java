package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class ProductOrderRegister implements OrderRegister {

    private Integer id;
    private ProductOrderService productOrderService;

    public ProductOrderRegister() {

    }

    public ProductOrderRegister(final Integer id, final ProductOrderService productOrderService) {
        this.id = id;
        this.productOrderService = productOrderService;
    }

    public Integer getId() {
        return id;
    }

    public List<ProductOrderService> createOrderList() {
        List<ProductOrderService> orders = new ArrayList<>();
        orders.add(productOrderService);
        return new ArrayList<>(orders);
    }
}
