package aqa.core.lesson7.LiubovPylypenko;

public class Circle extends Shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "This is " + this.getClass().getSimpleName() + ", color: " +
                super.shapeColor + ", radius=" + this.radius; }

}
