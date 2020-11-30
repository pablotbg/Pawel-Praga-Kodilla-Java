package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;

    public OrderProcessor(InformationService informationService, OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }

    public OrderDto process (final OrderRequest orderRequest) {
        boolean isOrder = orderService.process(orderRequest.getUser(), orderRequest.getProducts());
        if(isOrder) {
            informationService.information(orderRequest.getUser());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
