package com.kodilla.testing.shape;

public class Circle implements Shape {

    private String name = "Circle";
    private double r;
    private double pi = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return pi * r * r;
    }
}
