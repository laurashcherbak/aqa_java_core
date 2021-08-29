package aqa.core.lesson8.irynaKrechetova;

public class Circle extends Shape implements Comparable {

    private double radius;

    @Override
    public double calcArea() {
        return Math.PI*Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "This is Circle, color is: ".concat(this.getShapeColor()).concat(", radius =").concat(Double.toString(this.radius));
    }

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(this.toString() + ", area is: " + this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        Circle circle = (Circle) o;
        if (this.calcArea()>circle.calcArea()) return 1;
        if (this.calcArea()<circle.calcArea()) return -1;
        return 0;
    }
}
