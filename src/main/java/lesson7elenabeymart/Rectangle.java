package lesson7elenabeymart;

public class Rectangle extends Shape {
    public Rectangle(String color) {
        super(color);
    }

    public Rectangle() {

    }

    //Calculate and return area of triangle
    public double getArea() {
        return (getHeight() * getWidth()) / 2;
    }
    @Override
    public String toString() {
        return "This is a Rectangle, color :";
    }
}
