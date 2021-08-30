package aqa.core.lesson7kapusniak;

public class Rectangle extends Shape {

    private String Rectangle1;
    private String shapeColor3;
    private double width;
    private double height;

    {
        shapeColor3 = "BLUE";
    }

    {
        double width = 10;
        double height = 15;
    }

    public Rectangle(String shapeColor, String shape1, double width, double height) {
        super(shapeColor, shape1);
        this.Rectangle1 = Rectangle1;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        double result = width * height;
        return result;
    }

    @Override
    public String toString() {
        return "This is " + Rectangle1 + ", color: " + ", width = " + width + ", height = " + height;


    }
}





