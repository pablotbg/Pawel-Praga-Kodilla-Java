package com.kodilla.good.patterns.food2door;

public class OrderDto {

    public final User user;
    public final boolean isOrder;

    public OrderDto(final User user, final boolean isOrder) {
        this.user = user;
        this.isOrder = isOrder;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
