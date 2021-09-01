package aqa.core.lesson8.sikyrynska;
import java.util.Arrays;

public class lesson8 {
    public static void main(String[] args) {


        System.out.println("Task #2 ");
        Shape[] arr = {new Rectangle("Blue", 4, 11),
                new Circle("Brown", 5),
                new Triangle("Yellow",2,3,4)};
        for(Shape i:arr) {
            i.draw();
        }

        System.out.println("Task #3 ");
        Rectangle rect1 = new Rectangle("Green", 2, 5);
        Rectangle rect2 = new Rectangle("Green", 2, 3);
        int k = rect1.compareTo(rect2);
        if (k == 0) {
            System.out.println("1 == 2");
        } else if (k == 1) {
            System.out.println("1 > 2");
        } else {
            System.out.println("1 < 2");
        }

        Rectangle[] arr2 = {
                new Rectangle("White", 2, 13),
                new Rectangle("White", 6, 11),
                new Rectangle("White", 2, 9),

        };
        Arrays.sort(arr2);
        for(Rectangle i:arr2) {
            i.draw();
        }

        System.out.println("Task #4 ");

        Shape[] arr3 = {
                new Rectangle("Purple", 7, 12),
                new Rectangle("Purple", 3, 11),
                new Rectangle("Purple", 4, 13),
                new Circle("Pink", 15),
                new Circle("Pink", 10),
                new Circle("Pink", 11),
                new Triangle("White",5,5,5),
                new Triangle("White", 7,10,12),
                new Triangle("White", 10, 7, 6)
        };
        Arrays.sort(arr3, new ShapeComparator());
        for(Shape i:arr3) {
            i.draw();
        }



    }


}