package aqa.core.lesson6.LiubovPylypenko;

public class Rectangle extends Shape {
    private double width, length; //sides

    public Rectangle() {
        this("Default Rectangle",1, 1);
    }

    public Rectangle(double width, double length) {
        super("Default Rectangle");
        this.width = width;
        this.length = length;
    }

    public Rectangle(String shapeName, double width, double length) {
        super(shapeName);
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }
}
