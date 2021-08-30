package aqa.core.lesson7.barabash;

//Add to project a new class Rectangle which is a subclass of Shape.
public class Rectangle extends Shape{
    //Add to class Rectangle a private field’s width and height (of double type).
    private double width;
    private double height;
    //Add to class Rectangle constructor with color, width and height arguments.
    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //In class Rectangle override calcArea() method which must return area of rectangle (By the formula: area = width* height).
    @Override
    public double calcArea() {
        return getHeight() * getWidth();
    }
    //In class Rectangle override the toString() method.
    // It must return string which contain name of shape, color and rectangle width and height.
    @Override
    public String toString() {
        return "This is Rectangle, color: " + getShapeColor() +
                ", width=" + String.format("%.0f", width) +
                ", height=" + String.format("%.0f",height);
    }
}
