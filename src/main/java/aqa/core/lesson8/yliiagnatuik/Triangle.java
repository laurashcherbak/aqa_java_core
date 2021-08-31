package aqa.core.lesson8.yliiagnatuik;

public class Triangle extends Shape implements Comparable<Triangle> {

    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        return a * b * c;
    }

    @Override
    public String toString() {
        return "This is Triangle, color: " +
                getShapeColor() +
                ", a:" + a +
                ", b:" + b +
                ", c:" + c;
    }


    @Override
    public int compareTo(Triangle that) {
        if (this.a != that.a) {
            return (this.a < that.a ? -1 : 1);
        }

        if (this.b != that.b) {
            return (this.b < that.b ? -1 : 1);
        }

        if (this.c != that.c) {
            return (this.c < that.c ? -1 : 1);
        }

        return 0;
    }
}