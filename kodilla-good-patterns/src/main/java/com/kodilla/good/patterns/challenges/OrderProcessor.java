package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private OrderRegister orderRegister;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(OrderRegister orderRegister, OrderService orderService, OrderRepository orderRepository) {
        this.orderRegister = orderRegister;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process (final OrderRequest orderRequest) {
        boolean isOrder = orderService.productOrder(orderRequest.getUserBuyer(), orderRequest.getUserSeller(),
                orderRequest.getProduct(), orderRequest.getSupplier());
        if(isOrder) {
            orderRegister.createOrderList();
            orderRepository.createNewOrder();
            return new OrderDto(orderRequest.getUserBuyer(), true);
        } else {
            return new OrderDto(orderRequest.getUserBuyer(), false);
        }
    }
}
