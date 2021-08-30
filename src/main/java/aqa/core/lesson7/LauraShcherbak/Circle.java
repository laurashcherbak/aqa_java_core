package aqa.core.lesson7.LauraShcherbak;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        this.setShapeColor(" ");
        this.radius = 0.0;
    }

    public Circle(String shapeColor) {
        this.setShapeColor(shapeColor);
        this.radius = 0.0;
    }

    public Circle(String shapeColor, double radius) {
        this.setShapeColor(shapeColor);
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
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "This is Circle, colour is: " + getShapeColor() + ", radius=" + radius;
    }


}
