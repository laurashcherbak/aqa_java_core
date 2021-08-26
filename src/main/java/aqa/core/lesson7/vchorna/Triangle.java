package aqa.core.lesson7.vchorna;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double callArea() {
        double p = (a + b + c) / 2;
        return Math.pow(p * (p - a) * (p - c) * (p - b));
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s;
    }
}
