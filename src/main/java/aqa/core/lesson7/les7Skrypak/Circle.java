package aqa.core.lesson7.les7Skrypak;

public class Circle extends Shape {
    private final double radius;
    public double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    //constructor
    public Circle(String shapeName, String shapeColor, double radius) {
        super(shapeName, shapeColor);
        this.radius = radius;
    }
    @Override
    public double calcArea() {
        double result = pi * radius * radius;
        return result;
    }
    @Override
    public String toString() {
        return "This is " + shapeName + " color is " + shapeColor + ", radius=" + radius;
    }


}
