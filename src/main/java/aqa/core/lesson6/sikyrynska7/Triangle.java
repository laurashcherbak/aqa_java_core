package aqa.core.lesson6.sikyrynska7;

import static java.lang.Math.sqrt;

public class Triangle extends Shape {
    private double A;
    private double B;
    private double C;
    private String c;
    public Triangle () {
        this.A = 12;
        this.B = 15;
        this.C = 10;
        this.c = "BLACK";
    }
    public Triangle (Double A, Double B, Double C, String c) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.c = c;
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
    public String getColor() {
        return c;
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
    public void setColor(String c) {
        this.c = c;
    }
    @Override
    public double calcArea() {
        double p=(A+B+C)/2;
        return sqrt(p*(p-A)*(p-B)*(p-C));
    }
    @Override
    public String toString() {
        return "This is Triangle with color: "+ c + ", A = " +A + ", B = "+ B+ ", C = " +C;
    }
    public static void main (String args[]){
        Triangle nameTr1 = new Triangle();
        System.out.println(nameTr1.toString());

        Triangle nameTr2 = new Triangle ();
        double ShapeT = nameTr2.calcArea();
        System.out.println("Shape area is: " +ShapeT);
    }
}
