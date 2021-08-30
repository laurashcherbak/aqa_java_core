package aqa.core.lesson7.MykhailoOsadtsiv;

import javax.swing.*;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "This is Circle, color : " + getShapeColor() +
                ", radius=" + radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
