package com.kodilla.testing.shape;

import java.util.*;


public class ShapeCollector {
    Shape shape;

    List<Shape> list = new ArrayList<>();
    Shape square = new Square("Square");
    Shape circle = new Circle("Circle");
    Shape triangle = new Triangle("Triangle");

    public Shape addFigure(Shape shape) {
        list.add(square);
        list.add(circle);
        list.add(triangle);
        return shape;
    }

    public Shape removeFigure(Shape shape) {
        list.remove(square);
        list.remove(circle);
        list.remove(triangle);
        return shape;
    }

    public int getFigure(int n) {
        list.add(square);
        list.add(circle);
        list.add(triangle);
        list.get(1);
        return n;
    }

    public String showFigures() {
        list.add(square);
        list.add(circle);
        list.add(triangle);
        return list.toString();

    }
}
