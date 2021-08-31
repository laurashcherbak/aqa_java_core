package aqa.core.lesson7.knenko;

import static java.lang.Math.sqrt;


public class Triangle extends Shape{
    private double a, b, c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
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
    public double calcArea() {
        double p = (a+b+c)/2;
        return sqrt(p*(p-a)*(p-b)*(p-c));

    }
    @Override
    public String toString() {
        return "This is "+ getColor() + " Triangle, its first side a = " +a + ", the second side b = "+ b+ ", the third side c = " +c;
    }


}
