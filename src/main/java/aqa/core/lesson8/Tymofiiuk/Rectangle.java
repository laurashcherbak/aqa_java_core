package aqa.core.lesson8.Tymofiiuk;

public class Rectangle extends Shape {
    private final double a;
    private final double b;


    public Rectangle(String shapeColor, String shapeName, double a, double b) {
        super(shapeColor, shapeName);
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Rectangle" + " a=" + a +" b=" + b;
    }

    public double calcArea() {
        return (a * b);

    }
}