package aqa.core.lesson8.yliiagnatuik;

public class Rectangle extends Shape implements Comparable<Rectangle> {

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
        return "This is Rectangle, color: " + getShapeColor() + ", width: " + this.width + ", height: " + this.height;
    }


    @Override
    public int compareTo(Rectangle that) {
        if (this.width != that.width) {
            return (this.width < that.width ? -1 : 1);
        }

        if (this.height != that.height) {
            return (this.height < that.height ? -1 : 1);
        }

        return 0;
    }
}
