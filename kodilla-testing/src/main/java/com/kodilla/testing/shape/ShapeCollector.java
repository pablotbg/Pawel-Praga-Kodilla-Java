package com.kodilla.testing.shape;

import java.util.*;


public class ShapeCollector {
    Shape shape;

    List<Shape> list = new ArrayList<>();

    public Shape addFigure(Shape shape) {
        list.add(shape);
        return shape;
    }

    public Shape removeFigure(Shape shape) {
        list.remove(shape);
        return shape;
    }

    public int getFigure(int n) {
        return n;
    }

    public String showFigures() {
        return list.toString();
    }
}
