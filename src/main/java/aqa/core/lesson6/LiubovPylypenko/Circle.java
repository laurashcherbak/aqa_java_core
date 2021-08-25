package aqa.core.lesson6.LiubovPylypenko;

public class Circle extends Shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this("Default cirle",1);
    }

    public Circle(double radius) {
        super("Default circle");
        this.radius = radius;
    }

    public Circle(String circleName, double radius) {
        super(circleName);
        this.radius = radius;
    }

    @Override
    public double area() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    //specific new method
    public double diameter() {
        return 2 * this.radius;
    }
}
