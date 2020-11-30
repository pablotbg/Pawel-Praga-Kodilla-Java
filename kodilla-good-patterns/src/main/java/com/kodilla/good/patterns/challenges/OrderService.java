package com.kodilla.good.patterns.challenges;

public interface OrderService {

    boolean productOrder(final UserBuyer userBuyer, final UserSeller userSeller, final Product product,
                         final Supplier supplier);
}
