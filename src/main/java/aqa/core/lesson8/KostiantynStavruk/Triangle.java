package aqa.core.lesson8.KostiantynStavruk;

import java.util.Comparator;

public class Triangle extends Shape implements Comparable<Triangle> {
    private final double a, b, c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;
        return Math.pow(p * (p - a) * (p - b) * (p - c), 0.5);
    }

    @Override
    public String toString() {
        return "This is Triangle, color: " + getShapeColor() + " a=" + a + ", b=" + b + ", c=" + c;
    }


    @Override
    public int compareTo(Triangle o1) {
        if (this.calcArea() > o1.calcArea()) {
            return 1;
        }
        if (this.calcArea() < o1.calcArea()) {
            return -1;
        }
        return 0;
    }

}