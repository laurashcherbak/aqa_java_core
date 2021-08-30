package aqa.core.lesson7.barabash;

//Add to project new class Circle which is a subclass of Shape.
public class Circle extends Shape {
    //Add to class Circle a private field radius (of double type)
    private double radius;
    //Add to class Circle constructor with color and radius arguments.
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

    //In class Circle override calcArea() method which must return area of circle (by the formula: area = PI*radius2).
    @Override
    public double calcArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
    //In class Circle override the toString() method.
    // It must return string which contain name of shape, color and radius of circle.
    // Example: “This is Circle, color: GREEN, radius=22”
    @Override
    public String toString() {
        return "This is Circle, color : " + getShapeColor() +
                ", radius=" + radius;
    }
}