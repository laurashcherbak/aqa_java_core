package aqa.core.lesson8.lauraShcherbak;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nTask 2: ");

        Shape[] arr = {new Rectangle("RED", 11, 22),
                new Circle("GREEN", 10),
                new Triangle("BLACK",5,5,5)};
        for(Shape x:arr) {
            x.draw();
        }

        System.out.println("\nTask 3: ");

        Rectangle rectangle1 = new Rectangle("RED", 11, 22);
        Rectangle rectangle2 = new Rectangle("RED", 11, 22);
        int t = rectangle1.compareTo(rectangle2);
        if (t == 0) {
            System.out.println("Object 1 == Object 2");
        } else if (t == 1) {
            System.out.println("Object 1 > Object 2");
        } else {
            System.out.println("Object 1 < Object 2");
        }

        Rectangle[] arr2 = {
        new Rectangle("RED", 11, 22),
                new Rectangle("RED", 10, 10),
                new Rectangle("RED", 20, 20),
                new Rectangle("RED", 5, 5),
                new Rectangle("RED", 30, 30),
                new Rectangle("RED", 5, 10)
        };
        Arrays.sort(arr2);
        for(Rectangle x:arr2) {
            x.draw();
        }

        System.out.println("\nTask 4: ");

        Shape[] arr3 = {
                new Rectangle("RED", 11, 20),
                new Circle("GREEN", 10),
                new Rectangle("RED", 12, 21),
                new Circle("GREEN", 9),
                new Rectangle("RED", 14, 22),
                new Rectangle("RED", 13, 23),
                new Rectangle("RED", 16, 25),
                new Rectangle("RED", 15, 24),
                new Circle("GREEN", 15),
                new Triangle("BLACK",5,5,5)
        };
        Arrays.sort(arr3, new ShapeComparator());
        for(Shape x:arr3) {
            x.draw();
        }



    }


}
