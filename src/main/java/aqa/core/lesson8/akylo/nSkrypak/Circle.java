package aqa.core.lesson8.akylo.nSkrypak;

public class Circle extends Shape implements Comparable{
    private final double radius;
    public double pi = 3.14;

    public double getRadius() {
        return radius;
    }

    //constructor
    public Circle(String shapeName, String shapeColor, double radius) {
        super(shapeName, shapeColor);
        this.radius = radius;
    }
    @Override
    public double calcArea() {
        return pi * radius * radius;
    }
    @Override
    public String toString() {
        return "This is " + getShapeName() + " color is " + getShapeColor() + ", radius=" + getRadius();
    }
    @Override
    public double draw() {
        return 0;
    }

    //@Override
    public int compareTo(Object o) {
        Circle q=(Circle)o;
        if (this.calcArea()> q.calcArea()) return 1;
        if (this.calcArea()< q.calcArea()) return -1;
        return 0;
    }
}
