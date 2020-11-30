package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriver = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new SmsService(), new HealthyShopOrderService());
        orderProcessor.process(orderRequest);
    }
}
