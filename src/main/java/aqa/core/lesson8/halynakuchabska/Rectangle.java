package aqa.core.lesson8.halynakuchabska;

import java.util.Comparator;

public class Rectangle extends Shape implements Comparable, Comparator {
    private double width;
    private double height;
    public Rectangle(String color, double width, double height) {
        super(color);
        this.name = "Rectangle";
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(this.toString() + ", area is: " + this.calcArea());
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString() + ", width=" + this.width + ", height=" + this.height;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Rectangle) {
            if (((Rectangle) o).calcArea() == this.calcArea()) {
                return 0;
            }
            if (((Rectangle) o).calcArea() > this.calcArea()) {
                return -1;
            }
            if (((Rectangle) o).calcArea() < this.calcArea()) {
                return 1;
            }
        }
        return -1;
    }

    @Override
    public int compare(Object o1, Object o2) {
        String color1 = ((Rectangle) o1).shapeColor;
        String color2 = ((Rectangle) o2).shapeColor;
        return color1.compareTo(color2);
    }
}
