package aqa.core.lesson8.dianahrymaliuk;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 2");
        Shape[] arr = new Shape[3];
        arr[0] = new Triangle("black",5,5,5);
        arr[1] = new Rectangle("red", 11,22);
        arr[2] = new Circle("green", 10);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
        System.out.println("\nTask 3");
        Rectangle rectangle1 = new Rectangle("green", 6, 15);
        Rectangle rectangle2 = new Rectangle("yellow", 10, 7);
        int compare = rectangle2.compareTo(rectangle1);
        if (compare == 0) {
            System.out.println("The shapes have the same area");
        } else if (compare == 1) {
            System.out.println("Shape area 1 > Shape area 2");
        } else {
            System.out.println("Shape area 1 < Shape area 2");
        }
        Rectangle[] arr2 = {new Rectangle("black", 3, 3),
                new Rectangle("red", 5, 5),
                new Rectangle("yellow", 10, 20),
                new Rectangle("blue", 12, 5),
                new Rectangle("green", 9, 4),
                new Rectangle("green", 19, 5)};
        Arrays.sort(arr2);
        for(Rectangle rectangle: arr2) {
            System.out.println(rectangle);
        }
        System.out.println("\nTask 4");
        Shape[] arr3 = {
                new Rectangle("Purple", 7, 12),
                new Rectangle("Purple", 3, 11),
                new Rectangle("Purple", 4, 13),
                new Circle("Pink", 15),
                new Circle("Pink", 10),
                new Circle("Pink", 11),
                new Triangle("White",5,5,5),
                new Triangle("White", 7,10,12),
                new Triangle("White", 10, 7, 6)};
                Arrays.sort(arr3);
        for(Shape i: arr3); {
            System.out.println(Arrays.toString(arr3)); //Воно сортує по кольору, але результат (весь масив об"єктів) прописує в стрічку.
        }

//        Shape shape = new Shape("red");
//        System.out.println(shape);
//        System.out.println("\nTask 2");
//        Circle circle = new Circle("green", 10);
//        System.out.println(circle);
//        System.out.println("\nTask 3");
//        Rectangle rectangle = new Rectangle("red", 11, 22);
//        System.out.println(rectangle);
//        System.out.println("\nTask 4");
////        Triangle triangle = new Triangle("yellow", 5, 5, 5);
////        System.out.println(triangle);
//        System.out.println("\nTask 5");
//        Shape[] arr = new Shape[9];
//        arr[0] = new Rectangle("black", 3, 3);
//        arr[1] = new Rectangle("red", 5, 5);
//        arr[2] = new Rectangle("yellow", 10, 20);
//        arr[3] = new Rectangle("blue", 12, 5);
//        arr[4] = new Rectangle("green", 9, 4);
//        arr[5] = new Circle("red", 10);
//        arr[6] = new Circle("green", 5);
//        arr[7] = new Triangle("red", 3, 5, 12);
//        arr[8] = new Triangle("blue", 5, 10, 5);
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i].toString());
//        }
//        double sumArea = 0;
//        double sumRectArea = 0;
//        double sumTriangleArea = 0;
//        double sumCircleArea = 0;

//        for (int i = 0; i < arr.length; i++){
//            sumArea += arr[i].calcArea();
//        if (arr[i] instanceof Rectangle) {
//            sumRectArea += arr[i].calcArea();
//        }
//        if (arr[i] instanceof Triangle) {
//            sumTriangleArea += arr[i].calcArea();
//        }
//        if (arr[i] instanceof Circle) {
//            sumCircleArea += arr[i].calcArea();}
//    }
//        System.out.println("   ");
//        System.out.println("Total area: " + sumArea);
//        System.out.println("Rectangles total area: " + sumRectArea);
//        System.out.println("Circles total area: " + sumCircleArea);
//        System.out.println("Triangles total area: " + sumTriangleArea);
//    }
}}
