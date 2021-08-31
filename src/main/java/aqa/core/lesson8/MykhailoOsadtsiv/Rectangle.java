package aqa.core.lesson8.MykhailoOsadtsiv;

public class Rectangle extends Shape implements Comparable {
    private double widht;
    private double height;

    public Rectangle(String color, double widht, double height) {
        super(color);
        this.widht = widht;
        this.height = height;
    }

    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return getHeight() * getWidht();
    }

    @Override
    public String toString() {
        return "This is Rectange, color: " + getShapeColor() +
                ", widht=" + String.format("%.0f", widht) +
                ", height=" + String.format("%.0f", height);
    }

    @Override
    public void draw() {
        System.out.println(this.toString() +
        ", area is : " + String.format("%.0f", this.calcArea()));
    }

    @Override
    public int compareTo(Shape obj) {
        if (this.calcArea() > obj.calcArea()) {
            return 1;
        } else if (this.calcArea() == obj.calcArea()) {
            return 0;
        } else return -1;
    }

    @Override
    public int compare (Shape obj) {
        return (this.getShapeColor().compareTo(obj.getShapeColor()));
    }
}