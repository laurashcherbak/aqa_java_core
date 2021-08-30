package aqa.core.lesson7.lesson7kapusniak;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String shapeColor, String shape1, double a, double b, double c) {
        super(shapeColor, shape1);
        this.a = 5;
        this.b = 5;
        this.c = 5;
    }


    @Override
    public double calcArea() {
        return a * b * c;
    }
    @Override
    public String toString() {
        return "This is Triangle " + ", color: " + "a = " + a + "b = " + b + "c = " + c;


    }



}
