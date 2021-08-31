package aqa.core.lesson8.yuliiaavrakhova;

import java.util.Comparator;

public abstract class Shape implements Drawable, Comparator<Shape> {
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public int compare(Shape o1, Shape o2) {
        return o1.shapeColor.compareTo(o2.shapeColor);
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }
    @Override
    public String toString() {
        return "This is Shape"+
                "color is:" + shapeColor ;
    }

}
