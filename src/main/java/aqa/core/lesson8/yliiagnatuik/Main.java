package aqa.core.lesson8.yliiagnatuik;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task2");
        Rectangle rectangle = new Rectangle("GREEN", 13.44, 56.32);
        rectangle.draw();
        Circle circle = new Circle("WHITE", 433.44);
        circle.draw();
        Triangle triangle = new Triangle("RED", 13.44, 56.32, 32.1);
        triangle.draw();

        System.out.println("Task3");
        Rectangle rectangle1 = new Rectangle("GREEN", 14.44, 56.32);
        Rectangle rectangle2 = new Rectangle("YELLOW", 16.34, 56.32);
        System.out.println(rectangle1.compareTo(rectangle2));

        Rectangle[] arr2 = new Rectangle[]{
                new Rectangle("GREEN", 4.44, 6.32),
                new Rectangle("YELLOW", 59.44, 56.3),
                new Rectangle("WHITE", 140.44, 156.01),
                new Rectangle("RED", 1.12, 56.18),
                new Rectangle("PING", 0.44, 3.01),
                new Rectangle("BLUE", 140.78, 24.2)
        };

        Arrays.sort(arr2);
        for (Rectangle rec : arr2) {
            rec.draw();
        }

        System.out.println("Task4");
        Shape[] shapes = new Shape[]{
                new Circle("WHITE", 433.44),
                new Circle("PING", 433.44),
                new Rectangle("WHITE", 140.44, 156.01),
                new Rectangle("RED", 1.12, 56.18),
                new Triangle("YELLOW", 13.44, 56.32, 32.1),
                new Triangle("RED", 13.44, 56.32, 32.1),
                new Rectangle("PING", 0.44, 3.01),
                new Rectangle("BLUE", 140.78, 24.2),
                new Rectangle("GREEN", 4.44, 6.32),
                new Rectangle("YELLOW", 59.44, 56.3)
        };

        Arrays.sort(shapes, new ShapeComparator());
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}

