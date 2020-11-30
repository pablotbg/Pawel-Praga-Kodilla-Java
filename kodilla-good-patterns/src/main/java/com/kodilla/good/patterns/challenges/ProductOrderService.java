package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {

    public boolean productOrder (final UserBuyer userBuyer, final UserSeller userSeller, final Product product,
                                 final Supplier supplier) {

        System.out.println("NewOrder: " + userBuyer.getName() + " " + userBuyer.getSurname() + " from "
                + userBuyer.getAdress() + " order from " + userSeller.getName() + " in " + userSeller.getAdress()
                + " product " + product.getName() + " chosing delivery via "
                + supplier.getSupplier());
        return true;
    }
}
