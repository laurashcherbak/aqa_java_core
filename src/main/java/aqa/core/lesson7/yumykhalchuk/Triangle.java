package main.java.aqa.core.lesson7.yumykhalchuk;

public class Triangle extends Shape{
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
        return super.calcArea();
    }


    @Override
    public String toString() {
        return "This is" + " " + getShapeName() + ", color is:" + " " + getShapeColor() + ", a = " + a + " , b = " + b + " , c = " + c;
    }
}
