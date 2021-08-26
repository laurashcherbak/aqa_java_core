package aqa.core.lesson7.vchorna;

public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public Object calcArea() {
        double v = Math.PI * Math.pow(radius, 2);
        return v;
    }

    @Override
    public String toString() {
        return " This is Circle, color is: " + " radius = " + radius;
    }
}
