package aqa.core.lesson7.HalynaKuchabska;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // 1
        Shape shape = new Shape("Green");
        System.out.println(shape);

        //2
        Circle circle = new Circle("Red", 10);
        System.out.println(circle);
        System.out.println("Shape area is: " + circle.calcArea());

        //3
        Rectangle rectangle = new Rectangle("Blue", 10, 10);
        System.out.println(rectangle);
        System.out.println("Shape area is: " + rectangle.calcArea());

        //4
        Triangle triangle = new Triangle("Yellow", 5,5,5);
        System.out.println(triangle);
        System.out.println("Shape area is: " + triangle.calcArea());

        //5
        Shape[] arr = new Shape[9];
        arr[0] = new Rectangle("Green", 2, 3);
        arr[1] = new Rectangle("Green", 3, 3);
        arr[2] = new Rectangle("Green", 4, 7);
        arr[3] = new Rectangle("Green", 9, 5);
        arr[4] = new Rectangle("Green", 4, 10);

        arr[5] = new Circle("Red", 5);
        arr[6] = new Circle("Red", 10);

        arr[7] = new Triangle("Blue", 3,4,5);
        arr[8] = new Triangle("Blue", 5,5,5);
        double sumArea = 0;
        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumCircleArea = 0;
        for (Shape curr_shape : arr) {
            System.out.println(curr_shape + ", area is: " + curr_shape.calcArea());
            if (curr_shape instanceof Rectangle) {
                sumRectArea+= curr_shape.calcArea();
            }
            if (curr_shape instanceof  Triangle) {
                sumTriangleArea+= curr_shape.calcArea();
            }
            if (curr_shape instanceof Circle) {
                sumCircleArea+= curr_shape.calcArea();
            }
            sumArea+= curr_shape.calcArea();
        }
        System.out.println("Total area: " + sumArea);
        System.out.println("Rectangles total area: " + sumRectArea);
        System.out.println("Circle total area: " + sumCircleArea);
        System.out.println("Triangle total area: " + sumTriangleArea);

    }
}
