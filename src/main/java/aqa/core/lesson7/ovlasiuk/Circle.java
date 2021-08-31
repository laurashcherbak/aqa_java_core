package aqa.core.lesson7.ovlasiuk;

//Task2
public class Circle extends Shape {
    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.name = "Circle";
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return super.toString() + ", radius=" + this.radius;
    }
    }



