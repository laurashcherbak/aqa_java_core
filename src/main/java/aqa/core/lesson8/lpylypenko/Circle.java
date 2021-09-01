package aqa.core.lesson8.lpylypenko;

public class Circle extends Shape implements Comparable {
    private final double radius;
    final double pi = Math.PI;

    public Circle(String color, double radius) {
        super.shapeColor = color;
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return pi * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "This is " + this.getClass().getSimpleName() + ", color: " +
                super.shapeColor + ", radius=" + this.radius; }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle)o;
        if(this.calcArea() > circle.calcArea()) return 1;
        if(this.calcArea() < circle.calcArea()) return -1;
        return 0;
    }
}