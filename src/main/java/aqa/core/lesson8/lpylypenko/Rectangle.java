package aqa.core.lesson8.lpylypenko;

public class Rectangle extends Shape implements Comparable {
    private final double width, height; //sides

    public Rectangle(String color, double width, double height) {
        super.shapeColor = color;
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

    @Override
    public int compareTo(Object o) {
        Rectangle rectangle = (Rectangle)o;
        if(this.calcArea() > rectangle.calcArea()) return 1;
        if(this.calcArea() < rectangle.calcArea()) return -1;
        return 0;
    }

}