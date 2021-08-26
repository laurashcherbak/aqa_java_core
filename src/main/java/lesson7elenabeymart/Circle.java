package lesson7elenabeymart;

public class Circle extends Shape {
    private double radius;
    private String color;
    public Circle() {
        this.radius = 22;
        this.color = "GREEN";
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "This is a Circle, color : " +color+ " radius=" +radius;
    }
}
