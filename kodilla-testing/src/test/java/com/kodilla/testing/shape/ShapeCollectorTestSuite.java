package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


@DisplayName("TDD: Shape Collector Test Suite")

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Add figures tests")

    class AddFigures {

        ShapeCollector shapeCollector = new ShapeCollector();

        @Test
        void addSquare() {
            //Given
            Shape shape = new Square(5);
            //When
            boolean addChecking = shapeCollector.addFigure(shape);
            //Then
            assertEquals(true, addChecking);
        }

        @Test
        void addTriangle() {
            //Given
            Shape shape = new Triangle(4, 10);
            //When
            boolean addChecking = shapeCollector.addFigure(shape);
            //Then
            assertEquals(true, addChecking);
        }

        @Test
        void addCircle() {
            //Given
            Shape shape = new Circle(6);
            //When
            boolean addChecking = shapeCollector.addFigure(shape);
            //Then
            assertEquals(true, addChecking);
        }
    }

    @Nested
    @DisplayName("Remove figures tests")
    class RemoveFigures {

        ShapeCollector shapeCollector = new ShapeCollector();

        @Test
        void removeFigureNotExisting() {
            //Given
            Shape shape = new Triangle(6, 10);
            //When
            boolean removeChecking = shapeCollector.removeFigure(shape);
            //Then
            assertNotEquals(true, false);
        }

        @Test
        void removeSquare() {
            //Given
            Shape shape = new Square(4);
            shapeCollector.addFigure(shape);
            //When
            boolean removeChecking = shapeCollector.removeFigure(shape);
            //Then
            assertEquals(true, removeChecking);
        }
        @Test
        void removeTriangle() {
            //Given
            Shape shape = new Triangle(6, 10);
            shapeCollector.addFigure(shape);
            //When
            boolean removeChecking = shapeCollector.removeFigure(shape);
            //Then
            assertEquals(true, removeChecking);
        }

        @Test
        void removeCircle() {
            //Given
            Shape shape = new Circle(5);
            shapeCollector.addFigure(shape);
            //When
            boolean removeChecking = shapeCollector.removeFigure(shape);
            //Then
            assertEquals(true, removeChecking);
        }
    }

    @Nested
    @DisplayName("Get figures tests")

    class GetFigures {

        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(8);
        Shape triangle = new Triangle(5, 10);
        Shape circle = new Circle(4);

        @Test
        void getSquare() {
            //Given
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle);
            //When
            Shape result = shapeCollector.getFigure(0);
            //Then
            assertEquals(square, result);
        }

        @Test
        void getTriangle() {
            //Given
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle);
            //When
            Shape result = shapeCollector.getFigure(1);
            //Then
            assertEquals(triangle, result);
        }

        @Test
        void getCircle() {
            //Given
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            shapeCollector.addFigure(circle);
            //When
            Shape result = shapeCollector.getFigure(2);
            //Then
            assertEquals(circle, result);
        }
    }

    @Nested
    @DisplayName("Show all figures tests")

    class ShowAllFigures {

        @Test
        public void showFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(10);
            Shape triangle = new Triangle(5, 20);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(triangle);
            //When
            //Then
            Assertions.assertEquals(2, shapeCollector.shapeListSize());
            System.out.println(shapeCollector.showFigures());
        }

    }
}

