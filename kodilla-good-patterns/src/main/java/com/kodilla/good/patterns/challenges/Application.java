package com.kodilla.good.patterns.challenges;

class Application {
    public static void main(String[] args) {

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrive();

        OrderProcessor orderProcessor = new OrderProcessor(new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
