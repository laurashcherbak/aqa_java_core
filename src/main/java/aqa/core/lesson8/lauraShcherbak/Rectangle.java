package aqa.core.lesson8.lauraShcherbak;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
        this.setShapeColor(" ");
        this.width = 0.0;
        this.height = 0.0;
    }

    public Rectangle(String shapeColor) {
        this.setShapeColor(shapeColor);
        this.width = 0.0;
        this.height = 0.0;
    }

    public Rectangle(String shapeColor, double width) {
        this.setShapeColor(shapeColor);
        this.width = width;
        this.height = 0.0;
    }

    public Rectangle(String shapeColor, double width, double height) {
        this.setShapeColor(shapeColor);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "This is Rectangle, colour is: " + getShapeColor() + ", width=" + width + ", height=" + height;
    }

}
