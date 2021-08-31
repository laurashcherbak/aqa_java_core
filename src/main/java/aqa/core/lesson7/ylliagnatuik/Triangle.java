package aqa.core.lesson7.ylliagnatuik;

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
        return a * b * c;
    }

    @Override
    public String toString() {
        return "This is Triangle, color: " +
                getShapeColor() +
                ", a:" + a +
                ", b:" + b +
                ", c:" + c;
    }
}

