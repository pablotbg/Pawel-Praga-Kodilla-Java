package com.kodilla.testing.shape;

public class Square implements Shape {

    private String name;


    public Square(String name) {
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
