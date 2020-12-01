package com.kodilla.good.patterns.challenges;

public class Supplier {

    private final String supplier;

    public Supplier(final String supplier) {
        this.supplier = supplier;
    }

    public String getSupplier() {
        return supplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier1 = (Supplier) o;
        return getSupplier() != null ? getSupplier().equals(supplier1.getSupplier()) : supplier1.getSupplier() == null;
    }

    @Override
    public int hashCode() {
        return getSupplier() != null ? getSupplier().hashCode() : 0;
    }

    @Override
    public String toString() {
        return supplier;
    }
}
