package aqa.core.lesson7.RomanovYevgen;

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
    public String toString() {
        return "The Circle, color is: " + getShapeColor() +
                ", radius=" + radius;
    }


}























