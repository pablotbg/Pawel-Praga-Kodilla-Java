package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {

    public boolean productOrder(OrderRequest orderRequest) {

        System.out.println("Information: order to User " + orderRequest.getUserBuyer()
                + " from user " + orderRequest.getUserSeller() + " was realized. Product "
                + orderRequest.getProduct() + " will be delivery via " + orderRequest.getSupplier());
        return true;
    }
}
