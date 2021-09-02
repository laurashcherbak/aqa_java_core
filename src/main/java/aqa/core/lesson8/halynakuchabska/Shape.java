package aqa.core.lesson8.halynakuchabska;


import java.util.Comparator;

public abstract class Shape implements Drawable {
    protected String shapeColor;
    protected String name;
    private Shape() {
        this.name = "Shape";
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    public Shape(String color) {
        this();
        this.shapeColor = color;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "This is " + this.name + ", color is: " + this.shapeColor;
    }

}
