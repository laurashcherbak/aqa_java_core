package aqa.core.lesson8.yuliiaavrakhova;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Shape shape1 = new Shape("RED");
        //System.out.println(shape1);

        Circle circle = new Circle("GREEN", 10);
        //System.out.println(circle + ", Shape area is:" + circle.calcArea());
        Rectangle rectangle = new Rectangle("RED", 11, 22);
        //System.out.println(rectangle + ", Shape area is: " + rectangle.calcArea());
        Triangle triangle = new Triangle("BLACK", 5, 5, 5);
        //System.out.println(triangle + ", Shape area is: " + triangle.calcArea());
        Circle circle1 = new Circle("BLACK", 12);
        Rectangle rectangle1 = new Rectangle("GREEN", 12, 23);
        Triangle triangle2 = new Triangle("RED", 6, 6, 6);
        Rectangle rectangle2 = new Rectangle("YELLOW", 7, 7);
        Rectangle rectangle3 = new Rectangle("WHITE", 8, 8);
        Rectangle rectangle4 = new Rectangle("BLUE", 7, 5);
        double sumArea = 0;
        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumCircleArea = 0;
        Shape[] arr = new Shape[]{rectangle1, rectangle2, rectangle3, rectangle4, rectangle, circle, circle1, triangle, triangle2};
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i] + ", area is:" + arr[i].calcArea());
            sumArea += arr[i].calcArea();
            if (arr[i] instanceof Rectangle) {
                sumRectArea += arr[i].calcArea();
            }
            if (arr[i] instanceof Triangle) {
                sumTriangleArea += arr[i].calcArea();
            }
            if (arr[i] instanceof Circle) {
                sumCircleArea += arr[i].calcArea();
            }
        }
        System.out.println("Total Area = " + sumArea);
        System.out.println("Circle Total Area = " + sumCircleArea);
        System.out.println("Rectangles Total Area = " + sumRectArea);
        System.out.println("Triangle Total Area = " + sumTriangleArea);

        Triangle t1 = new Triangle("Red",4,6,3);
        System.out.println(t1.draw());

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].draw());
        }
        Triangle triangle55 = new Triangle("RED", 6, 6, 6);
        Triangle triangle4 = new Triangle("RED", 7, 7, 7);
            System.out.println(triangle4.compareTo(triangle55));
        Rectangle rectangle33 = new Rectangle("WHITE", 81, 86);
        Rectangle rectangle44 = new Rectangle("BLUE", 72, 50);
            System.out.println(rectangle33.compareTo(rectangle44));
        Rectangle rectangle11 = new Rectangle("GREEN", 12, 23);
        Rectangle rectangle23 = new Rectangle("YELLOW", 73, 77);
        Rectangle rectangle31 = new Rectangle("WHITE", 82, 86);
        Rectangle rectangle41 = new Rectangle("BLUE", 74, 54);

        Rectangle[] arr2 = new Rectangle[]{rectangle41,rectangle31,rectangle23,rectangle33,rectangle11,rectangle44};
        Arrays.sort(arr2,Rectangle::compareTo);
        System.out.println(Arrays.toString(arr2));
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i].draw());
        }

        Shape[] arr3 = new Shape[]{circle1,rectangle41,triangle4,rectangle31,triangle55,rectangle23,rectangle33,rectangle11,rectangle44,circle};
        for(int i = 0; i < arr3.length; i ++) {
            for (int j = i; j < arr3.length; j ++){
                if (arr3[i].compare(arr3[i], arr3[j]) > 0) {
                    Shape temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted alphanumeric array");
        System.out.println(Arrays.toString(arr3));
    }

}
