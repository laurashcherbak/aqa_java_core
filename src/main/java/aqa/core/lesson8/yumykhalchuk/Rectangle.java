package aqa.core.lesson8.yumykhalchuk;

import java.util.Comparator;

public class Rectangle extends Shape implements Drawable, Comparable, Comparator {
    private double width;
    private double height;
    private double sumRectArea;

    public Rectangle() {

    }

    public Rectangle(double sumArea) {
        super(sumArea);

    }

    public Rectangle(String shapeName, String shapeColor, double width, double height) {
        super(shapeName, shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        double area = width * height;
        return area;

    }

    @Override
    public void draw() {
        System.out.println(toString() + ", area is: " + calcArea());
    }

    @Override
    public String toString() {
        return "This is" + " " + getShapeName() +", color is:" + " " + getShapeColor() + ", width =" + " " + width + " , height =" + " " + height;
    }

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle)o;
        if (calcArea() == rectangle.calcArea()) {
            return 0;
        } else if (calcArea() > rectangle.calcArea()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public int compare(Object ob1, Object ob2) {
        Rectangle rectangle1 = (Rectangle)ob1;
        Rectangle rectangle2 = (Rectangle)ob2;
        return rectangle1.getShapeColor().compareTo(rectangle2.getShapeColor());
    }
}
