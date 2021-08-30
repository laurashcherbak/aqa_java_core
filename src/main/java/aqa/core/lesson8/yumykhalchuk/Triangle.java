package aqa.core.lesson8.yumykhalchuk;

import java.util.Comparator;

public class Triangle extends Shape implements Drawable, Comparable, Comparator {
    private double a;
    private double b;
    private double c;
    private double sumTriangleArea;
    public Triangle(){

    }

    public Triangle(double sumArea){
        super(sumArea);

    }

    public Triangle(String shapeName, String shapeColor, double a, double b, double c) {
        super(shapeName, shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double p;
        p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;

    }

    @Override
    public void draw() {
        System.out.println(toString() + ", area is: " + calcArea());
    }

    @Override
    public String toString() {
        return "This is" + " " + getShapeName() + ", color is:" + " " + getShapeColor() + ", a = " + a + " , b = " + b + " , c = " + c;
    }

    @Override
    public int compareTo(Object o) {
        Triangle triangle = (Triangle)o;
        if (calcArea() == triangle.calcArea()) {
            return 0;
        } else if (calcArea() > triangle.calcArea()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public int compare(Object ob1, Object ob2) {
        Triangle triangle1 = (Triangle)ob1;
        Triangle triangle2 = (Triangle)ob2;
        return triangle1.getShapeColor().compareTo(triangle2.getShapeColor());
    }
}
