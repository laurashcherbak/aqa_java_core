package aqa.core.lesson8.kfedechko;

public class Circle extends Shape {

    private double radius;

    public Circle(String shapeColor, Double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return 3.14159 * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() + ", color is: " + getShapeColor().toUpperCase()
                + ", radius=" + radius;
    }

    @Override
    public void draw() {
        System.out.print(toString());
        System.out.println(" Shape area is: " + calcArea());
    }
}
