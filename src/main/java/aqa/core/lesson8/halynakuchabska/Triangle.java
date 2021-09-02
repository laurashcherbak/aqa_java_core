package aqa.core.lesson8.halynakuchabska;

import java.util.Comparator;

public class Triangle extends Shape implements Comparable, Comparator {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.name = "Triangle";
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.println(this.toString() + ", area is: " + this.calcArea());
    }

    @Override
    public double calcArea() {
        if (!this.isTriangleValid(this.a, this.b, this.c)) {
            System.out.println("Triangle is not valid");
            return -1;
        } else {
            double p = (this.a + this.b + this.c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }

    private boolean isTriangleValid(double a, double b, double c) {
        return (a + b) > c && (a + c) > b && (b + c) > a;
    }

    @Override
    public String toString() {
        return super.toString() + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Triangle) {
            if (((Triangle) o).calcArea() == this.calcArea()) {
                return 0;
            }
            if (((Triangle) o).calcArea() > this.calcArea()) {
                return -1;
            }
            if (((Triangle) o).calcArea() < this.calcArea()) {
                return 1;
            }
        }
        return -1;
    }

    @Override
    public int compare(Object o1, Object o2) {
        String color1 = ((Triangle) o1).shapeColor;
        String color2 = ((Triangle) o2).shapeColor;
        return color1.compareTo(color2);
    }
}
