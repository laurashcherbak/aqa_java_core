package aqa.core.lesson8.KostiantynStavruk;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------START-------------------->");
        System.out.println(">>>>>>>Task2.1-2.3<<<<<<<");
        System.out.println("----------------------------------------------------------------------------------");


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


        for (Shape shape : arr) {
            shape.draw();
        }
        Rectangle r1 = new Rectangle("Blue", 9.8, 34);
        Rectangle r2 = new Rectangle("White", 15, 4);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(">>>>>>>Task3.1<<<<<<<"
                + "\n----------------------------------------------------------------------------------"
                + "\nResult = " + r1.compareTo(r2));
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(">>>>>>>Task3.2-3.3<<<<<<<");
        System.out.println("----------------------------------------------------------------------------------");


        Rectangle[] arr1 = new Rectangle[]{
                new Rectangle("White", 15, 4),
                new Rectangle("Black", 1.1, 5.5),
                new Rectangle("Blue", 9.8, 34),
                new Rectangle("Pink", 5.1, 5),
                new Rectangle("Creamy", 5, 9),
                new Rectangle("Red", 8, 7)};

        Arrays.sort(arr1);

        for (Rectangle r : arr1) {
            r.draw();
        }
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println(">>>>>>>Task4.0<<<<<<<");
        System.out.println("----------------------------------------------------------------------------------");

        Shape[] task4 = new Shape[]{
                new Rectangle("Blue", 9.8, 34),
                new Rectangle("White", 15, 4),
                new Rectangle("Black", 1.1, 5.5),
                new Rectangle("Cian", 9.4, 7.3),
                new Rectangle("Aqua", 12, 4),
                new Circle("Brown", 3),
                new Circle("Orange", 5),
                new Circle("Lime", 3),
                new Circle("Purple", 5),
                new Triangle("Pink", 5.1, 5, 9.4),
                new Triangle("Creamy", 5, 9, 4.5)};

        Arrays.sort(task4, new ComparatorAll());
        for (Shape rr : task4) {
            rr.draw();
        }
        System.out.println("----------------------------------------------END--------------------------------------------->");

        // System.out.println(task4);
    }
}
