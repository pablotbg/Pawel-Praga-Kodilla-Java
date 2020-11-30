package com.kodilla.good.patterns.challenges;

public class OrderDto {

    public UserBuyer userBuyer;
    public boolean isOrder;

    public OrderDto(final UserBuyer userBuyer, final boolean isOrder) {
        this.userBuyer = userBuyer;
        this.isOrder = isOrder;
    }

    public UserBuyer getUserBuyer() {
        return userBuyer;
    }

    public boolean isOrder() {
        return isOrder;
    }
}
