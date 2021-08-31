package aqa.core.lesson8.nSkrypak;

public class Triangle extends Shape implements Comparable{
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
    public double calcArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    @Override
    public String toString() {
        return "This is Triangle, color: " + super.getShapeColor() + " a=" + a + ", b=" + b + ", c=" + c + ".";
    }

    @Override
    public double draw() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        Triangle q=(Triangle) o;
        if (this.calcArea()> q.calcArea()) return 1;
        if (this.calcArea()< q.calcArea()) return -1;
        return 0;
    }
}
