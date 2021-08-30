package aqa.core.lesson8.yumykhalchuk;

import java.util.Comparator;

public class Circle extends Shape implements Drawable, Comparable, Comparator {
    private static final double PI = 3.1415926;
    private double radius;
    private double sumCircleArea;

    public Circle(){

    }
    public Circle(double sumArea){
        super(sumArea);

    }

    public Circle(String shapeName, String shapeColor, double radius) {
        super(shapeName, shapeColor);
        this.radius = radius;
    }

    public double getSumCircleArea() {
        return sumCircleArea;
    }

    public void setSumCircleArea(double sumCircleArea) {
        this.sumCircleArea = sumCircleArea;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        double area = PI * radius * radius;
        return area;
    }

    @Override
    public void draw() {
        System.out.println(toString() + ", area is: " + calcArea());
    }

    @Override
    public String toString() {
        return "This is" + " " + getShapeName() + ", color is:" + " " + getShapeColor() ;

    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle)o;
        if (calcArea() == circle.calcArea())
            return 0;
        else if (calcArea() > circle.calcArea())
            return 1;
        else
            return -1;

    }

    @Override
    public int compare(Object ob1, Object ob2) {
        Circle circle1 = (Circle)ob1;
        Circle circle2 = (Circle)ob2;
        return circle1.getShapeColor().compareTo(circle2.getShapeColor());
    }
}
