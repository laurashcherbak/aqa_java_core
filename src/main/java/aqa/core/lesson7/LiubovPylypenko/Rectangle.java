package aqa.core.lesson7.LiubovPylypenko;

public class Rectangle extends Shape {
    private final double width, height; //sides

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "This is " + this.getClass().getSimpleName() + ", color: " +
                super.shapeColor + ", width=" + this.width + ", height=" + this.height; }

}