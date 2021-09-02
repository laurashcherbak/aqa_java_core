package aqa.core.lesson8.nSkrypak;

public class Rectangle extends Shape implements Comparable{
    private final double width;
    private final double height;

    public Rectangle(String shapeColor, String shapeName, double width, double height) {
        super(shapeColor, shapeName);
        this.width = width;
        this.height = height;
    }
    @Override
    public double calcArea() {
        return width * height;
    }
    @Override
    public String toString() {
        return "This is Rectangle, color: " + super.getShapeColor() + ", width = " + width + ", height = " + height;
    }
    @Override
    public double draw() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        Rectangle q=(Rectangle) o;
        if (this.calcArea()> q.calcArea()) return 1;
        if (this.calcArea()< q.calcArea()) return -1;
        return 0;
    }
}
