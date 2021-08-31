package aqa.core.lesson8.halynakuchabska;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Task 2
        Circle circle = new Circle("GREEN", 10);

        Rectangle rectangle = new Rectangle("RED", 11, 22);

        Triangle triangle = new Triangle("BLACK", 5,5,5);

        Shape[] arr = new Shape[3];
        arr[0] = rectangle;
        arr[1] = triangle;
        arr[2] = circle;

        for (Shape curr_shape : arr) {
            curr_shape.draw();
        }

        // Task 3
        Rectangle rectangle1 = new Rectangle("RED", 11, 22);
        Rectangle rectangle2 = new Rectangle("RED", 11, 22);
        Rectangle rectangle3 = new Rectangle("RED", 21, 22);
        System.out.println(rectangle1.compareTo(rectangle2) == 0);
        System.out.println(rectangle2.compareTo(rectangle3) == 0);

        Rectangle[] rect_arr = new Rectangle[6];
        rect_arr[0] = new Rectangle("Green", 20, 15);
        rect_arr[1] = new Rectangle("Green", 10, 10);
        rect_arr[2] = new Rectangle("Green", 4, 7);
        rect_arr[3] = new Rectangle("Green", 9, 5);
        rect_arr[4] = new Rectangle("Green", 4, 100);
        rect_arr[5] = new Rectangle("Green", 4, 11);

        System.out.println("Original array");
        for (Rectangle rect : rect_arr) {
            rect.draw();
        }

        System.out.println("Sorted array");
        Arrays.sort(rect_arr);
        for (Rectangle rect : rect_arr) {
            rect.draw();
        }

        // Task 4
        List<Shape> arr2 = new ArrayList<>();
        arr2.add(new Rectangle("Red", 2, 3));
        arr2.add(new Rectangle("Black", 3, 3));
        arr2.add(new Rectangle("Grey", 4, 7));
        arr2.add(new Rectangle("Blue", 9, 5));
        arr2.add(new Rectangle("Yellow", 4, 10));

        arr2.add(new Circle("Red", 5));
        arr2.add(new Circle("Yellow", 10));

        arr2.add(new Triangle("Blue", 3,4,5));
        arr2.add(new Triangle("Green", 5,5,5));
        arr2.add(new Triangle("Yellow", 5,5,5));

        System.out.println("Original custom array");
        for (Shape rect : arr2) {
            rect.draw();
        }

        System.out.println("Sorted custom array");
        Collections.sort(arr2, new Comparator<Shape>(){
            public int compare(Shape o1, Shape o2){
                String color1 = ((Shape) o1).shapeColor;
                String color2 = ((Shape) o2).shapeColor;
                return color1.compareTo(color2);
            }
        });
        for (Shape rect : arr2) {
            rect.draw();
        }
    }
}
