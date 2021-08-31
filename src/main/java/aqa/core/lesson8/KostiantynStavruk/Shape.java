package aqa.core.lesson8.KostiantynStavruk;

import java.util.Comparator;

public abstract class Shape implements Drawable, Comparator<Shape> {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "This is Shape, color is: " + shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public void draw() {
        System.out.println(toString() + ", area is " + calcArea());
    }

    @Override
    public int compare(Shape o1, Shape o2) {
        return o1.getShapeColor().compareTo(o2.getShapeColor());
    }
}