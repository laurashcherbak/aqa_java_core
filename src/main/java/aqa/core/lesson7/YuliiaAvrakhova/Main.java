package aqa.core.lesson7.YuliiaAvrakhova;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape("RED");
        System.out.println(shape1);

        Circle circle = new Circle("GREEN", 10);
        System.out.println(circle + ", Shape area is:" + circle.calcArea());
        Rectangle rectangle = new Rectangle("RED", 11, 22);
        System.out.println(rectangle + ", Shape area is: " + rectangle.calcArea());
        Triangle triangle = new Triangle("BLACK", 5, 5, 5);
        System.out.println(triangle + ", Shape area is: " + triangle.calcArea());
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
            System.out.println(arr[i] + ", area is:" + arr[i].calcArea());
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

    }

}
