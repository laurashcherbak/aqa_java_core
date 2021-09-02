package aqa.core.lesson8.yliiagnatuik;

public class Circle extends Shape implements Comparable<Circle> {

    private double radius;

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return 3.14 * radius;
    }

    @Override
    public String toString() {
        return "This is a Circle, color:" + getShapeColor() + ", radius: " + this.radius;
    }


    @Override
    public int compareTo(Circle that) {
        if (this.radius != that.radius) {
            return (this.radius < that.radius ? -1 : 1);
        }

        return 0;
    }

}
