package aqa.core.lesson8.KostiantynStavruk;

import java.util.Comparator;

public class Circle extends Shape implements Comparable<Circle> {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "This is Circle, color: " + getShapeColor() + " radius = " + radius;
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.calcArea(), o.calcArea());
    }
}