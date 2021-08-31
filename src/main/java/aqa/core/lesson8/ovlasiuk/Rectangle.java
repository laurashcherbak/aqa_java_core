package aqa.core.lesson8.ovlasiuk;

public class Rectangle extends Shape {
    private final double height;
    private final double width;

    public Rectangle(String shapeColor, double height, double width) {
        super(shapeColor);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calcArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return super.toString() + ", height = " + this.height + ", width = " + this.width;
    }
}