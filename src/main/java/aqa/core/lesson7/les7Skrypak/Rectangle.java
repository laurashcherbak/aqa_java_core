package aqa.core.lesson7.les7Skrypak;

public class Rectangle extends Shape{
    private final double width;
    private final double height;

    public Rectangle(String ShapeColor, double width, double height) {
        super(ShapeColor);
        this.width = width;
        this.height = height;
    }
    @Override
    public double calcArea() {
        return width * height;
    }
    @Override
    public String toString() {
        return "This is Rectangle, color: " + super.getShapeColor() + ", width = " + width + ", height = " + height;
    }
}
