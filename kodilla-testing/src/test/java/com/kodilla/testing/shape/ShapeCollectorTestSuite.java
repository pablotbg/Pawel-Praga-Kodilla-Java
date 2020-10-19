package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;


@DisplayName("TDD: ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Nested
    @DisplayName("Tests of the shapes in List")
    class TestAddAndRemove {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            List<Shape> list = new ArrayList<>();
            Shape square = new Square("Square");
            Shape circle = new Circle("Circle");
            Shape triangle = new Triangle("Triangle");
            list.add(square);
            list.add(circle);
            list.add(triangle);

            //When
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);

            //Then
            Assertions.assertEquals(3, list.size());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            List<Shape> list = new ArrayList<>();
            Shape square = new Square("Square");
            Shape circle = new Circle("Circle");
            Shape triangle = new Triangle("Triangle");
            list.add(square);
            list.add(circle);
            list.add(triangle);

            //When
            shapeCollector.removeFigure(square);
            shapeCollector.removeFigure(circle);
            shapeCollector.removeFigure(triangle);

            //Then
            Assertions.assertEquals(0, shapeCollector.list.size());
        }
    }

    @Nested
    @DisplayName("Tests of the get and show shapes in List")
    class TestGetAndShow {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            List<Shape> list = new ArrayList<>();
            Shape square = new Square("Square");
            Shape circle = new Circle("Circle");
            Shape triangle = new Triangle("Triangle");
            list.add(square);
            list.add(circle);
            list.add(triangle);

            //When
            int figure = shapeCollector.getFigure(1);



            //Then
            Assertions.assertEquals(1, figure);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            List<Shape> list = new ArrayList<>();
            Shape square = new Square("Square");
            Shape circle = new Circle("Circle");
            Shape triangle = new Triangle("Triangle");
            list.add(square);
            list.add(circle);
            list.add(triangle);

            //When
            String expected = "[Shape: Square, Shape: Circle, Shape: Triangle]";

            //Then
            Assertions.assertEquals(expected, shapeCollector.showFigures());
        }
    }
}


