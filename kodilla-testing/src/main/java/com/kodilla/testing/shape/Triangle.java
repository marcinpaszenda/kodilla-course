package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name = "Triangle";
    double a;
    double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return 0.5 * a * h;

    }
}
