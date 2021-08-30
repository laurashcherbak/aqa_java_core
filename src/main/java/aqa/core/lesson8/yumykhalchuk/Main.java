package main.java.aqa.core.lesson8.yumykhalchuk;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = {new Rectangle("Rectangle", "blue", 18, 9),
                new Rectangle("Rectangle", "orange", 24, 17),
                new Rectangle("Rectangle", "purple", 30, 22),
                new Rectangle("Rectangle", "black", 12, 8),
                new Rectangle("Rectangle", "yellow", 11, 10),
                new Circle("Circle", "green", 15),
                new Circle("Circle", "brown", 9),
                new Triangle("Triangle", "grey", 9, 8, 7),
                new Triangle("Triangle", "gold", 4, 5, 6)};
        /*for (Shape shape : shapes) {
            shape.draw();
        }*/

        Rectangle rectangle1 = new Rectangle("Rectangle", "grey", 19, 28);
        Rectangle rectangle2 = new Rectangle("Rectangle", "gold", 26, 14);
        //System.out.println(rectangle1.compareTo(rectangle2));

        Rectangle[] rectangles = { new Rectangle("Rectangle", "yellow", 15, 10),
                new Rectangle("Rectangle", "blue", 18, 9),
                new Rectangle("Rectangle", "purple", 30, 22),
                new Rectangle("Rectangle", "orange", 24, 17),
                new Rectangle("Rectangle", "black", 12, 8),
                new Rectangle("Rectangle", "yellow", 21, 13)};

        /*Arrays.sort(rectangles);
        System.out.println();
        System.out.println("Sorted array is : ");
        for(Rectangle rect : rectangles) {
            rect.draw();
        }*/

        Shape[]allOfShapes =  { new Rectangle("Rectangle", "red", 19, 13),
                                new Rectangle("Rectangle", "blue", 40, 28),
                                new Rectangle("Rectangle", "gold", 22, 8),
                                new Rectangle("Rectangle", "yellow", 35, 10),
                                new Circle("Circle", "pink", 27),
                                new Circle("Circle", "black", 14),
                                new Triangle("Triangle", "grey", 5, 7, 9),
                                new Triangle("Triangle", "white", 4, 9, 12),
                                new Triangle("Triangle", "purple", 5, 7, 8),
                                new Triangle("Triangle", "green", 6, 10, 13)};


        Rectangle rec1 = new Rectangle("Rectangle", "orange", 24, 17);
        Rectangle rec2 = new Rectangle("Rectangle", "black", 12, 8);
        Arrays.sort(allOfShapes, new Shape() {
            @Override
            public double calcArea() {
                return 0;
            }
        });

        System.out.println();
        System.out.println("Sorted array is : ");
        for(Shape sh : allOfShapes) {
            sh.draw();
        }



    }

}

