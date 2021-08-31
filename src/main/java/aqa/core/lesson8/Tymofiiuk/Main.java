package aqa.core.lesson8.Tymofiiuk;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 2 ");
        Shape[] arr = {
                new Rectangle(" red ", " rectangle ", 11, 22),
                new Circle(" green ", " circle ", 10),
                new Triangle(" black ", " Triangle ", 5, 5, 5)
        };
        for (Shape i : arr) {
            i.draw();
        }

        System.out.println("Task 3 ");
        Rectangle rect1 = new Rectangle(" brown ", " rectangle ", 8, 10);
        Rectangle rect2 = new Rectangle(" brown ", " rectangle ", 10, 22);
        Rectangle rect3 = new Rectangle(" brown ", " rectangle ", 90, 5);
        int k = rect1.compareTo(rect2);
        if (k == 0) {
            System.out.println("1 == 2");
        } else if (k == 1) {
            System.out.println("1 > 2");
        } else {
            System.out.println("1 < 2");
        }

        Rectangle[] arr2 = {
                new Rectangle(" red ", " rectangle ", 10, 10),
                new Rectangle(" red ", " rectangle ", 11, 22),
                new Rectangle(" red ", " rectangle ", 100, 5),

        };
        Arrays.sort(arr2);
        for (Rectangle i : arr2) {
            i.draw();
        }

        System.out.println("Task 4 ");

        Shape[] arr3 = {
                new Rectangle(" Yellow ", " rectangle ", 12, 12),
                new Rectangle(" Yellow ", " rectangle ", 11, 15),
                new Rectangle(" Yellow ", " rectangle ", 13, 20),
                new Circle(" Blue ", " circle ", 2),
                new Circle(" Blue ", " circle ",9),
                new Circle(" Blue ", " circle ",5),
                new Triangle(" Cyan ", " triangle ", 5, 5, 5),
                new Triangle(" Cyan ", " triangle ", 10, 12, 12),
                new Triangle(" Cyan ", " triangle ", 7, 9, 9)
        };
        Arrays.sort(arr3);
        for (Shape i : arr3) {
            i.draw();
        }
    }
}
