package aqa.core.lesson8.KostiantynStavruk;

import java.util.Comparator;

public class Rectangle extends Shape implements Comparable<Rectangle> {
    private double width, height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color: " + getShapeColor() + " width = " + width + ", height = " + height;
    }

    @Override
    public int compareTo(Rectangle o) {
        return Double.compare(this.calcArea(), o.calcArea());
    }

}