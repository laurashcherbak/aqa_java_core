package aqa.core.lesson8.MykhailoOsadtsiv;

public class Circle extends Shape implements Comparable {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "This is Circle, color : " + getShapeColor() +
                ", radius=" + radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void draw() {
        System.out.println(this.toString() +
                ", area is : " + String.format("%.5f", this.calcArea()));
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
