package main.java.aqa.core.lesson7.yumykhalchuk;

public class Main {
    public static void main(String[] args) {

        Shape shape1 = new Shape("Shape", "RED");
        // System.out.println(shape.toString());
        Circle circle = new Circle("Circle", "GREEN", 10);
        //System.out.println("Shape area is:" + " " + circle.calcArea());
        Rectangle rectangle = new Rectangle("Rectangle", "RED", 11, 22);
        //System.out.println(rectangle.toString());
        //System.out.println("Shape area is:" + " " + rectangle.calcArea(11 * 12));
        Triangle triangle = new Triangle("Triangle", "BLACK", 5, 5, 5);
        //System.out.println(triangle.toString());
        //System.out.println("Shape area is:" + " " + triangle.calcArea(Math.sqrt((5 + 5 + 5)/2 * (((5 + 5 + 5)/2) - 5) * (((5 + 5 + 5)/2) - 5) * (((5 + 5 + 5)/2) - 5))));

        Shape[] shapes = {new Rectangle("Rectangle", "blue", 18, 9),
                new Rectangle("Rectangle", "orange", 24, 17),
                new Rectangle("Rectangle", "purple", 30, 22),
                new Rectangle("Rectangle", "black", 12, 8),
                new Rectangle("Rectangle", "yellow", 11, 10),
                new Circle("Circle", "green", 15),
                new Circle("Circle", "brown", 9),
                new Triangle("Triangle", "grey", 9, 8, 7),
                new Triangle("Triangle", "gold", 4, 5, 6)};
        for (Shape sh : shapes) {
            System.out.println(sh.toString() + ", area is: " + sh.calcArea());
        }
        double sumRectangleArea = 0.0;
        double sumCircleArea = 0.0;
        double sumTriangleArea = 0.0;

        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                sumRectangleArea += shape.calcArea();
            }
            if (shape instanceof Triangle) {
                sumTriangleArea += shape.calcArea();
            }
            if (shape instanceof Circle) {
                sumCircleArea += shape.calcArea();
            }
        }
        System.out.println("Rectangles total area:" + " " + sumRectangleArea + ", Circle total area:" + " " + sumCircleArea + ", Triangle total area: " + sumTriangleArea);



    }
}

