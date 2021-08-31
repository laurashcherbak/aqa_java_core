package aqa.core.lesson7.ylliagnatuik;

public class Circle extends Shape {

    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return 3.14 * radius;
    }

    @Override
    public String toString() {
        return "This is a Circle, color:" + getShapeColor() + ", radius: " + this.radius;
    }
}
