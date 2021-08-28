package aqa.core.lesson8.akylo.sikyrynska;

public class Circle extends Shape{
    private double r;

    public Circle() {
        this.setShapeColor(" ");
        this.r= 0.0;
    }

    public Circle(String sC) {
        this.setShapeColor(sC);
        this.r = 0.0;
    }

    public Circle(String sC, double r) {
        this.setShapeColor(sC);
        this.r = r;
    }

    public double getRadius() {
        return r;
    }

    public void setRadius(double r) {
        this.r = r;
    }

    @Override
    public double calcArea() {
        return 3.141516 * r * r;
    }

    @Override
    public String toString() {
        return "This is circle, colour is " + getShapeColor() + ", radius is " + r;
    }


}
