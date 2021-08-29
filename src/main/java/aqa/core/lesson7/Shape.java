package aqa.core.lesson7;

    //Task1

public class Shape {

    protected String shapeColor;
    protected String name;
    private Shape() {
        this.name = "Shape";
    }

    public Shape(String color) {
        this();
        this.shapeColor = color;
    }

    public double calcArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "This is " + this.name + ", color is: " + this.shapeColor;
    }
}


