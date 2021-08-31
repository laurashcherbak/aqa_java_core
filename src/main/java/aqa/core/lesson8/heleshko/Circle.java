package aqa.core.lesson8.heleshko;

public class Circle extends Shape {
    private final double radius;

    public Circle(String shapeColor, String shapeName, double radius) {
        super(shapeColor, shapeName);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "This is " + getShapeName() + ", " + "color: " + getShapeColor() + ", " + "radius = " + this.radius;
    }

    public double calcArea() {
        return this.radius * 3.14;
    }
}
