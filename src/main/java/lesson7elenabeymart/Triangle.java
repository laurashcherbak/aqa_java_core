package lesson7elenabeymart;

public class Triangle extends Shape {
    public Triangle(String color) {
        super(color);
    }

    public Triangle() {
        super();
    }

    //Calculate and return area of triangle
    public double getArea() {
        return (getHeight() * getWidth()) / 2;
    }
}
