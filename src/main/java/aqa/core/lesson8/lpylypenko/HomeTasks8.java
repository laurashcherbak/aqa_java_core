package aqa.core.lesson8.lpylypenko;
import java.util.Arrays;

public class HomeTasks8 {

    public static void main(String[] args) {

        System.out.println("\nTask1");
        System.out.println("Implemented in separated classes.");

        System.out.println("\nTask2");
        //interface Drawable task
        Shape[] arr1 = new Shape[] {
                new Rectangle("RED", 11, 22),
                new Rectangle("WHITE", 10, 21),
                new Rectangle("BLACK", 12, 24),
                new Rectangle("GREEN", 13, 15),
                new Rectangle("BLUE", 17, 30),
                new Rectangle("YELLOW", 5, 6),
                new Circle("GREEN", 8),
                new Circle("RED", 10),
                new Triangle("BLACK", 5, 5, 5),
                new Triangle("WHITE", 12, 8, 6),
        };
        for (Shape shapeItem:arr1) {
            shapeItem.draw();
        }

        //Two rectangles comparing
        System.out.println("\nTask3");
        Rectangle rectangle1 = new Rectangle("RED", 11, 22);
        Rectangle rectangle2 = new Rectangle("WHITE", 10, 21);
        int compareResult = rectangle1.compareTo(rectangle2);
        if (compareResult == 1)  System.out.println("recangle1 > rectangel2");
        else if (compareResult == -1)  System.out.println("recangle1 < rectangel2");
        else System.out.println("recangle1 equal rectangel2");

        //Sort rectangles  according to Comparable interface
        Rectangle[] arr2 = new Rectangle[] {
                new Rectangle("RED", 11, 22),
                new Rectangle("WHITE", 10, 21),
                new Rectangle("BLACK", 12, 24),
                new Rectangle("GREEN", 13, 15),
                new Rectangle("BLUE", 17, 30),
                new Rectangle("YELLOW", 5, 6),
        };
        Arrays.sort(arr2);
        for (Rectangle rectangle:arr2) {
            rectangle.draw();
        }

        //Comparator
        System.out.println("\nTask4");
        Arrays.sort(arr1, new SortByColor());
        for (Shape shapeItem:arr1) {
            shapeItem.draw();
        }
    }
}
