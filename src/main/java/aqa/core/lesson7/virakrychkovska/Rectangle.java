package main.java.aqa.core.lesson7.virakrychkovska;

public class Rectangle {
    private double width;
    private double height;
    private String color;

    public Rectangle() {
        this.width = 11;
        this.height = 22;
        this.color = "RED";
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color: " + this.color + ", width=" + this.width + ", height=" + this.height;
    }

    public static void main(String args[]) {
        Circle firstRectangle = new Rectangle();
        System.out.println(firstRectangle.toString());

        Circle secondRectangle = new Rectangle();
        double shapeAreaR = secondRectangle.calcArea();
        System.out.println("Shape area is: " + shapeAreaR);
    }
}
