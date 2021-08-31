package aqa.core.lesson7.kfedechko;

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
    public double calcArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() + ", color is: " + getShapeColor().toUpperCase()
                + ", a=" + a + ", b=" + b + ", c=" + c;
    }
}
