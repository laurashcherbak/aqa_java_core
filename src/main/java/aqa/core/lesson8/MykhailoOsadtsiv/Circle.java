package aqa.core.lesson8.MykhailoOsadtsiv;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "This is Circle, color : " + getShapeColor() +
                ", radius=" + radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
        System.out.println("Circle area is : " + String.format("%.5f", this.calcArea()));
    }
}
