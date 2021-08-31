package aqa.core.lesson8.Tymofiiuk;

public class Triangle extends Shape {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(String shapeColor, String shapeName, double a, double b, double c) {
        super(shapeColor, shapeName);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle" + " a=" + a +" b=" + b + " c=" + c;
    }

    public double calcArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
    }
}
