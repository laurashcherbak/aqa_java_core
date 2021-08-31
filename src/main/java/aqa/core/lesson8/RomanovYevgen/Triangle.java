package aqa.core.lesson8.RomanovYevgen;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle() {
        this.setShapeColor(" ");
        this.a = 0.0;
        this.b = 0.0;
        this.c = 0.0;
    }

    public Triangle(String shapeColor) {
        this.setShapeColor(shapeColor);
        this.a = 0.0;
        this.b = 0.0;
        this.c = 0.0;
    }

    public Triangle(String shapeColor, double a) {
        this.setShapeColor(shapeColor);
        this.a = a;
        this.b = 0.0;
        this.c = 0.0;
    }

    public Triangle(String shapeColor, double a, double b) {
        this.setShapeColor(shapeColor);
        this.a = a;
        this.b = b;
        this.c = 0.0;
    }

    public Triangle(String shapeColor, double a, double b, double c) {
        this.setShapeColor(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "The colour is: " + getShapeColor() + ", a=" + a + ", b=" + b + ", c=" + c;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}