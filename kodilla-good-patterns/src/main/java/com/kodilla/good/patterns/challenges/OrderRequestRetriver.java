package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriver {

    public OrderRequest retrive() {
        UserBuyer userBuyer = new UserBuyer("John", "Smith", "Berlin");
        UserSeller userSeller = new UserSeller("Eco-Food","Tokyo");
        Product product = new Product("Crabs");
        Supplier supplier = new Supplier("DHL");

        return new OrderRequest(userBuyer, userSeller, product, supplier);
    }
}
