package aqa.core.lesson8.elenabeymart;

public class Circle extends Shape {
    private static final String Color = "GREEN";
    private final double radius;
    final double pi = Math.PI;
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double calcArea() {
        return pi * Math.pow(radius, 2);
    }
    @Override
    public Object area() {
        return null;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius = " + radius;
    }

    public double perimeter() {
        return 2 * pi * radius;
    }
}
