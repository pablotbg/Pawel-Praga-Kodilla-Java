package com.kodilla.good.patterns.challenges;

public class Product {

    private String name;
    private String model;

    public Product(final String name) {
        this.name = name;
    }

    public Product(final String name, final String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        if (getName() != null ? !getName().equals(product.getName()) : product.getName() != null) return false;
        return getModel() != null ? getModel().equals(product.getModel()) : product.getModel() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getModel() != null ? getModel().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product: " + name + ". Model: " + model;
    }
}
