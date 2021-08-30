package aqa.core.lesson8.yumykhalchuk;

import java.util.Comparator;

abstract class Shape implements Drawable, Comparable, Comparator {
    private String shapeColor;
    private String shapeName;
    private double area;
    private double sumArea;

    public Shape() {

    }

    public Shape(double sumArea) {
        this.sumArea = sumArea;
    }

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public Shape(String shapeName, String shapeColor) {
        this.shapeName = shapeName;
        this.shapeColor = shapeColor;

    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getSumArea() {
        return sumArea;
    }

    public void setSumArea(double sumArea) {
        this.sumArea = sumArea;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double calcArea();

    public void draw() {
        System.out.println(toString() + ", area is: " + calcArea());
    }

    @Override
    public String toString() {
        return "This is" + " " + shapeName + ", color is:" + " " + shapeColor;
    }

    public int compareTo(Object o) {
        Shape shape = (Shape) o;
        if (this.area == shape.area) {
            return 0;
        } else if (this.area > shape.area) {
            return 1;
        } else {
            return -1;
        }
    }

    public int compare(Object ob1, Object ob2) {
        Shape shape1 = (Shape) ob1;
        Shape shape2 = (Shape) ob2;
            return shape1.getShapeColor().compareTo(shape2.getShapeColor());
    }
}
