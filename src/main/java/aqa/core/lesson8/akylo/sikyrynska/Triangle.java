package aqa.core.lesson8.akylo.sikyrynska;

import static java.lang.Math.sqrt;

public class Triangle extends Shape{
    private double A;
    private double B;
    private double C;

    public Triangle() {
        this.setShapeColor(" ");
        this.A = 0.0;
        this.B = 0.0;
        this.C = 0.0;
    }

    public Triangle(String sC) {
        this.setShapeColor(sC);
        this.A = 0.0;
        this.B = 0.0;
        this.C = 0.0;
    }

    public Triangle(String sC, double A) {
        this.setShapeColor(sC);
        this.A = A;
        this.B = 0.0;
        this.C = 0.0;
    }

    public Triangle(String shapeColor, double A, double B) {
        this.setShapeColor(shapeColor);
        this.A = A;
        this.B = B;
        this.C = 0.0;
    }

    public Triangle(String shapeColor, double A, double B, double C) {
        this.setShapeColor(shapeColor);
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public double getC() {
        return C;
    }

    public void setA(double A) {
        this.A = A;
    }

    public void setB(double B) {
        this.B = B;
    }

    public void setC(double C) {
        this.C = C;
    }

    @Override
    public double calcArea() {
        double p = (A + B + C) / 2;
        return sqrt(p * (p - A) * (p - B) * (p - C));
    }

    @Override
    public String toString() {
        return "This is triangle, colour is " + getShapeColor() + ", A = " + A + ", B = " + B + ", C = " + C;
    }


}