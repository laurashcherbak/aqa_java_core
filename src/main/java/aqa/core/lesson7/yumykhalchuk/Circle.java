package main.java.aqa.core.lesson7.yumykhalchuk;

public class Circle extends Shape{
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
        return super.calcArea();
    }

    @Override
    public String toString() {
        return "This is" + " " + getShapeName() + ", color is:" + " " + getShapeColor() ;
    }
}
