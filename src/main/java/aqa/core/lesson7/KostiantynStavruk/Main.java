package aqa.core.lesson7.KostiantynStavruk;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape("Magenta");
        System.out.println(shape1);
        System.out.println("----------------------------------------->");
        Circle circle1 = new Circle("Grey", 5);
        System.out.println(circle1);
        System.out.println("Shape area is: " + circle1.calcArea());
        System.out.println("----------------------------------------->");
        Rectangle rectangle1 = new Rectangle("Yellow", 10, 20);
        System.out.println(rectangle1);
        System.out.println("Shape area is: " + rectangle1.calcArea());
        System.out.println("----------------------------------------->");
        Triangle triangle1 = new Triangle("Red", 5, 5, 5);
        System.out.println(triangle1);
        System.out.println("Shape area is: " + triangle1.calcArea());
        System.out.println("----------------------------------------->");

        Shape[] arr = new Shape[]{
                new Rectangle("Blue", 9.8, 34),
                new Rectangle("White", 15, 4),
                new Rectangle("Black", 1.1, 5.5),
                new Rectangle("Cian", 9.4, 7.3),
                new Rectangle("Aqua", 12, 4),
                new Circle("Brown", 3),
                new Circle("Orange", 5),
                new Triangle("Pink", 5.1, 5, 9.4),
                new Triangle("Creamy", 5, 9, 4.5)};
        double sumArea = 0.0;
        for (Shape shape : arr) {
            System.out.println(shape + " Area is: " + shape.calcArea());
            System.out.println("----------------------------------------------------------------------------------");
            sumArea += shape.calcArea();

        }
        System.out.println("This is total area of all shapes: " + sumArea);
        System.out.println("----------------------------------------------------------------------------------");

        double sumReactArea = 0.0,
                sumTriangleArea = 0.0,
                sumCircleArea = 0.0;
        for (Shape shape : arr) {
            if (shape instanceof Rectangle) {
                sumReactArea += shape.calcArea();
            }
            if (shape instanceof Triangle) {
                sumTriangleArea += shape.calcArea();
            }
            if (shape instanceof Circle) {
                sumCircleArea += shape.calcArea();
            }
        }
        System.out.println("Rectangle total area = " + sumReactArea +
                "\nTriangle total area = " + sumTriangleArea + "\nCircle total area = " + sumCircleArea);
        System.out.println("----------------------------------------------------------------------------------");


    }


}
