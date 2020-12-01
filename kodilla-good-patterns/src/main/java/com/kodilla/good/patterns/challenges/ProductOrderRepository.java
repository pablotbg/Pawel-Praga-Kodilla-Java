package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {

    public boolean createNewOrder(OrderRequest orderRequest) {
        System.out.println("NewOrder: " + orderRequest.getUserBuyer() + " order from " + orderRequest.getUserSeller()
                + " product " + orderRequest.getProduct() + " delivery via " + orderRequest.getSupplier());

        return true;
    }
}
