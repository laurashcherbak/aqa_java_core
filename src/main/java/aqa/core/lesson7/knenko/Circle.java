package aqa.core.lesson7.knenko;
public class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double calcArea() {
        return 3.1415 * radius * radius;
    }
    @Override
    public String toString() {
        return "This is " +getColor() + " Circle, its radius is: " + radius;
    }
}