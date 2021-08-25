package aqa.core.lesson7.LiubovPylypenko;

public class Triangle extends Shape {
    private final double a, b, c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "This is " + this.getClass().getSimpleName() + ", color: " +
                super.shapeColor + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c; }

}