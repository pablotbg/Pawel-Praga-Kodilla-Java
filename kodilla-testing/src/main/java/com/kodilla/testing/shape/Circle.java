package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String name;

    public Circle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String names = "Shape: " + getShapeName();
        return names;
    }

    @Override
    public String getShapeName() {
        return getName();
    }

    @Override
    public int getField() {
        return 0;
    }
}
