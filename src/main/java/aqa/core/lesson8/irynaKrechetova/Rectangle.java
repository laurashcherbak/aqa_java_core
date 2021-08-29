package aqa.core.lesson8.irynaKrechetova;

import java.util.ArrayList;
import java.util.Comparator;

public class Rectangle extends Shape implements Comparable {

    private double width;
    private double height;

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color is: ".concat(this.getShapeColor()).concat(", width =").concat(Double.toString(this.width)).concat(", height =").concat(Double.toString(this.height));
    }

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(this.toString() + ", area is: " + this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle) o;
        if (this.calcArea()>rectangle.calcArea()) return 1;
        if (this.calcArea()<rectangle.calcArea()) return -1;
        return 0;
    }





}
