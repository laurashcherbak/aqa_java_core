package aqa.core.lesson8;

public class Circle extends Shape {
    private final double rad;

    public Circle(String shapeColor, String shapeName, double rad) {
        super(shapeColor, shapeName);
        this.rad = rad;
    }

    @Override
    public String toString() {
        return "Circle" + " radius = " + this.rad;
    }

    public double calcArea() {
        return this.rad * this.rad * 3.14;
    }
}