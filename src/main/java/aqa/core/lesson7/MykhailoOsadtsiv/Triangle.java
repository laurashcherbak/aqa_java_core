package aqa.core.lesson7.MykhailoOsadtsiv;

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

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double calcArea() {
        double p = ( a + b + c ) / 2;
        double sqrtS = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(sqrtS);
    }

    @Override
    public String toString() {
        return "This is Triangle, color: " + getShapeColor() +
                ", a=" + String.format("%.0f", a ) +
                ", b=" + String.format("%.0f", b ) +
                ", c=" + String.format("%.0f", c);
    }
}
