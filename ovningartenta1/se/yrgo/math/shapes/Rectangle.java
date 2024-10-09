package se.yrgo.math.shapes;

import interfaces.*;

public class Rectangle implements Shape {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double area() {
        return width * length;
    }

    public double perimeter() {
        return (width * 2) + (length * 2);
    }
}
