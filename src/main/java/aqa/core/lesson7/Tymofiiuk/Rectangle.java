package aqa.core.lesson7.Tymofiiuk;

public class Rectangle extends Shape {
    private final double a;
    private final double b;
    private final double c;
    private final double d;

    public Rectangle(String shapeColor, String shapeName, double a, double b, double c, double d) {
        super(shapeColor, shapeName);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Shape: " + getShapeName() + ", " + "color: " + getShapeColor() + ", " + "a=" + a +" b=" + b + " c=" + c + " d=" + d;
    }

    public double calcArea() {
        return (a * b);

    }
}