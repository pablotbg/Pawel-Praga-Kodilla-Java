package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name;

    public Triangle(String name) {
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
