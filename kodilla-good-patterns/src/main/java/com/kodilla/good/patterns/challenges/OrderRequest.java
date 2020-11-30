package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private UserBuyer userBuyer;
    private UserSeller userSeller;
    private Product product;
    private Supplier supplier;

    public OrderRequest(final UserBuyer userBuyer, final UserSeller userSeller, final Product product,
                        final Supplier supplier) {
        this.userBuyer = userBuyer;
        this.userSeller = userSeller;
        this.product = product;
        this.supplier = supplier;
    }

    public UserBuyer getUserBuyer() {
        return userBuyer;
    }

    public UserSeller getUserSeller() {
        return userSeller;
    }

    public Product getProduct() {
        return product;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
