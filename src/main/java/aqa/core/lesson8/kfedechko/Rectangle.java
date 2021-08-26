package aqa.core.lesson8.kfedechko;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "This is " + getClass().getSimpleName() + ", color is: " + getShapeColor().toUpperCase()
                + ", width=" + width + ", height=" + height;
    }

    @Override
    public void draw() {
        System.out.print(toString());
        System.out.println(" Shape area is: " + calcArea());
    }
}
