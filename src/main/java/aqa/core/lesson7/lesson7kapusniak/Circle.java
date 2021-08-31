package aqa.core.lesson7.lesson7kapusniak;

public class Circle extends Shape {
        private final double radius;
        private String circle1;
        private String shapeColor2;


    {
        shapeColor2 = "GREEN";
    }

    public Circle(String shapeColor2, String shape1, double radius) {
        super(shapeColor2, shape1);
        this.radius = radius;
        radius = 10;



    }
    public double pi = 3.14;



    public double getRadius() {
        return radius;
    }
    @Override
    public double calcArea() {
        double result = pi * radius * radius;
        return result;

    }
    @Override
    public String toString() {
        return "This is " + circle1 + ", color: " + shapeColor2 + ", radius=" + radius;
    }
}

