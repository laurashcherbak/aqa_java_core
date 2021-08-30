package aqa.core.lesson7.KostiantynStavruk;

public class Triangle extends Shape {
    private final double a, b, c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;
        return Math.pow(p * (p - a) * (p - b) * (p - c), 0.5);
    }

    @Override
    public String toString() {
        return "This is Triangle, color: " + "a=" + a + ", b=" + b + ", c=" + c;
    }
}
