package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public OrderProcessor(final OrderService orderService, final OrderRepository orderRepository) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrder = orderService.productOrder(orderRequest);
        if(isOrder) {
            orderRepository.createNewOrder(orderRequest);
            return new OrderDto(orderRequest.getUserBuyer(), true);
        } else {
            return new OrderDto(orderRequest.getUserBuyer(), false);
        }
    }
}
