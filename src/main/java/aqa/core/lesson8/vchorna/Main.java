package aqa.core.lesson8.vchorna;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Shape[] array = {
                new Circle("Green", 9),
                new Triangle("Orange", 5, 5, 7),
                new Rectangle("Purple", 8, 6)
        };


        for (Shape x : array) {
            x.draw();
        }

        Rectangle r1 = new Rectangle("Purple", 8, 6);
        Rectangle r2 = new Rectangle("Purple", 12, 18);

        int c = r1.compareTo(r2);
        System.out.println(c);


        Rectangle[] array1 = {
                new Rectangle("Purple", 8, 6),
                new Rectangle("Purple", 12, 18),
                new Rectangle("Purple", 14, 16),
                new Rectangle("Purple", 4, 10),
                new Rectangle("Purple", 10, 20),
                new Rectangle("Purple", 12, 22)
        };
        Arrays.sort(array1);
        for (Rectangle x : array1) {
            x.draw();
        }
        Shape[] array2 = {
                new Rectangle("Purple", 8, 6),
                new Circle("Green", 5),
                new Rectangle("Purple", 11, 22),
                new Circle("Green", 9),
                new Rectangle("Purple", 12, 16),
                new Rectangle("Purple", 14, 18),
                new Triangle("Orange", 2, 4, 6),
                new Triangle("Orange", 3, 5, 7),
                new Rectangle("Purple", 4, 6)
        };
        Arrays.sort(array2, new ShapeColorComparator());
        for (Shape x : array2) {
            x.draw();
        }


    }
}




