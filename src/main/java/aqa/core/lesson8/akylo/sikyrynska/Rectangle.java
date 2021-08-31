package aqa.core.lesson8.akylo.sikyrynska;

public class Rectangle extends Shape {
    private double w;
    private double h;

    public Rectangle() {
        this.setShapeColor(" ");
        this.w = 0.0;
        this.h = 0.0;
    }

    public Rectangle(String sC) {
        this.setShapeColor(sC);
        this.w = 0.0;
        this.h = 0.0;
    }

    public Rectangle(String sC, double w) {
        this.setShapeColor(sC);
        this.w = w;
        this.h = 0.0;
    }

    public Rectangle(String sC, double w, double h) {
        this.setShapeColor(sC);
        this.w = w;
        this.h = h;
    }

    public double getWidth() {
        return w;
    }

    public double getHeight() {
        return h;
    }

    public void setWidth(double w) {
        this.w = w;
    }

    public void setHeight(double h) {
        this.h = h;
    }

    @Override
    public double calcArea() {
        return w * h;
    }

    @Override
    public String toString() {
        return "This is rectangle, colour is " + getShapeColor() + ", " +
                "width = " + w + ", height = " + h;
    }

}