package main.java.aqa.core.lesson8.halynakuchabska;

import java.util.Comparator;

public class Circle extends Shape implements Comparable, Comparator {
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.name = "Circle";
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(this.toString() + ", area is: " + this.calcArea());
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return super.toString() + ", radius=" + this.radius;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Circle) {
            if (((Circle) o).calcArea() == this.calcArea()) {
                return 0;
            }
            if (((Circle) o).calcArea() > this.calcArea()) {
                return -1;
            }
            if (((Circle) o).calcArea() < this.calcArea()) {
                return 1;
            }
        }
        return -1;
    }

    @Override
    public int compare(Object o1, Object o2) {
        String color1 = ((Circle) o1).shapeColor;
        String color2 = ((Circle) o2).shapeColor;
        return color1.compareTo(color2);
    }

}
