package aqa.core.lesson7.knenko;

public class Rectangle extends Shape{
    private double length, width;
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public void setA(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calcArea() {
        return length * width;
    }
    @Override
    public String toString() {
        return "This is " + getColor() + " Rectangle, its length is: " + length + ", width is "+ width + "";
    }

}
