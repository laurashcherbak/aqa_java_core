package aqa.core.lesson7.ovlasiuk;

//Task3
public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(String color, double width, double height) {
        super(color);
        this.name = "Rectangle";
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + ", width=" + this.width + ", height=" + this.height;
    }

}