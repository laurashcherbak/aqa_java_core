package aqa.core.lesson8.irynaKrechetova;

public class Circle extends Shape {

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
}
