package aqa.core.lesson7.barabash;

//Add to project a new class Triangle which is a subclass of Shape
public class Triangle extends Shape{
    //Add to class Triangle a private field’s a, b, c (of double type) which is sides of triangle.
    private double a, b, c;

    //Add to class Triangle constructor with color, a, b and c arguments.
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

    //In class Triangle override calcArea() method which must return area of triangle.
    @Override
    public double calcArea() {
        double p = ( a + b + c ) / 2;
        double sqrtS = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(sqrtS);
    }

    //In class Triangle override the toString() method.
    // It must return string which contain name of shape, color and a, b, c sides of triangle.
    @Override
    public String toString() {
        return "This is Triangle, color: " + getShapeColor() +
                ", a=" + String.format("%.0f", a ) +
                ", b=" + String.format("%.0f", b ) +
                ", c=" + String.format("%.0f", c);
    }
}