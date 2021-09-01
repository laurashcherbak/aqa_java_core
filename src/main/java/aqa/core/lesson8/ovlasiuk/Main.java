package aqa.core.lesson8.ovlasiuk;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Shape[] array = {
                new Circle("GREEN", 10),
                new Triangle("BLACK", 5, 5, 5),
                new Rectangle("RED", 22, 11)
        };


        for (Shape x : array) {
            x.draw();
        }

        Rectangle r1 = new Rectangle("RED", 10, 10);
        Rectangle r2 = new Rectangle("RED", 12, 18);

        int c = r1.compareTo(r2);
        System.out.println(c);


        Rectangle[] array1 = {
                new Rectangle("RED", 10, 10),
                new Rectangle("RED", 22, 11),
                new Rectangle("RED", 5, 100),
        };
        Arrays.sort(array1);
        for (Rectangle x : array1) {
            x.draw();
        }
        Shape[] array2 = {
                new Rectangle("RED", 8, 6),
                new Circle("BLACK", 5),
                new Rectangle("RED", 11, 22),
                new Circle("BLACK", 9),
                new Rectangle("GREEN", 12, 16),
                new Rectangle("RED", 14, 18),
                new Triangle("BLACK", 2, 4, 6),
                new Triangle("RED", 3, 5, 7),
                new Rectangle("BLACK", 4, 6),
                new Rectangle("BLACK", 11, 22)
        };
        Arrays.sort(array2, new ShapeComparator());
        for (Shape x : array2) {
            x.draw();
        }


    }
}