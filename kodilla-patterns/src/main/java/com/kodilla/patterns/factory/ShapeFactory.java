package com.kodilla.patterns.factory;

public class ShapeFactory {

    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";

    public final Shape makeShape(final String shapeClass) {
        switch (shapeClass) {
            case CIRCLE:
                return new Circle("The rounded circle", 4.50);
            case SQUARE:
                return new Square("the angular square", 7.0);
            case RECTANGLE:
                return new Rectangle("the long rectangle", 15, 2.5);
            default:
                return null;
        }
    }
}
