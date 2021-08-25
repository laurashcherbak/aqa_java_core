package aqa.core.lesson7.KostiantynStavruk;

public class Rectangle extends Shape {
    private double width, height;

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
        return "This is Rectangle, color: " + "width = " + width + ", height = " + height;
    }

}

