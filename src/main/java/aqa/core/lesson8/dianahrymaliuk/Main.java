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
                new Rectangle("red", 4, 10),
                new Rectangle("blue", 5, 16),
                new Rectangle("red", 8, 3),
                new Circle("green", 10),
                new Circle("green", 12),
                new Circle("blue", 11),
                new Triangle("red",5,5,5),
                new Triangle("blue", 7,10,9),
                new Triangle("white", 7, 7, 6)};
                Arrays.sort(arr3);
        for(Shape i: arr3); {
            System.out.println(Arrays.toString(arr3)); //Воно сортує по кольору, але результат (весь масив об"єктів) прописує в стрічку.
        }

}}
