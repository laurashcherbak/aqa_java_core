package aqa.core.lesson7.barabash;

//Create class Main with method main().
public class Main {

    public static void main(String[] args) {
        // The program must demonstrate the creation of one Shape object and print it name and color to console.

        Shape shapeRed = new Shape("RED");
        System.out.println(shapeRed.toString());

        //Add to class Main code to create one Circle object and print it name color, and radius to console.
        // Then invoke calcArea() method and print result to console.

        Circle circleGreen = new Circle("GREEN", 10);
        System.out.println(circleGreen.toString());
        System.out.println("Circle area is:" + String.format("%.5f", circleGreen.calcArea()));

        //Add to class Main code to create one Rectangle object and print it name, color, width and height to console.
        // Then invoke calcArea() method and print result to console.

        Rectangle rectangleRed = new Rectangle("RED", 11, 22);
        System.out.println(rectangleRed.toString());
        System.out.println("Rectangle area is : " + String.format("%.0f",rectangleRed.calcArea()));

        //Add to class Main code to create one Triangle object and print it name, color, a, b, c sides of triangle to console.
        // Then invoke calcArea() method and print result to console.

        Triangle triangleBlack = new Triangle("BLACK", 5, 5, 5);
        System.out.println(triangleBlack.toString());
        System.out.println("Shape area is : " + String.format("%.3f",triangleBlack.calcArea()));

        //Create array (Shape[] arr) of different Shape objects
        Shape[] arr = new Shape[9];
        //five rectangles
        arr[0] = new Rectangle("Yellow", 20, 30);
        arr[1] = new Rectangle("Brown", 21, 16);
        arr[2] = new Rectangle("White", 3, 4);
        arr[3] = new Rectangle("Purple", 11, 35);
        arr[4] = new Rectangle("Orange", 45, 25);
        //two circles
        arr[5] = new Circle("Green", 2);
        arr[6] = new Circle("Silver", 3);
        //two triangles
        arr[7] = new Triangle("Golden", 3, 5, 7);
        arr[8] = new Triangle("Pink", 1, 3, 5);
        //Add code to calculate total area of all shape types.
        // Define sumArea (of double type) local variable and use it in loop to sum total area for all shapes.
        double sumArea=0;
        //Add code to sum total area for each shape types.
        // Define sumRectArea, sumTriangleArea, sumCircleArea (of double type) local variables and use it in loop to sum total area for each shape type.
        // You should use instanceof keyword for determining, total area for each of shape types (Rectangle, Circle, Triangle) and print it to console.
        double sumRectArea=0;
        double sumTriangleArea=0;
        double sumCircleArea=0;

        //Add code to iterate over shapes array in loop (use for-each loop)
        // and print characteristics of each shape on console (using toString() method) with area of this shape (using calcArea() method).
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
            System.out.println("Shape area is : " + arr[i].calcArea());
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
        System.out.println("Total area is :" + String.format("%.3f", sumArea));
        System.out.println("Rectangles total area: " + String.format("%.0f", sumRectArea));
        System.out.println("Triangles total area: " + String.format("%.3f", sumTriangleArea));
        System.out.println("Circles total area: " + String.format("%.3f", sumCircleArea));
    }
}