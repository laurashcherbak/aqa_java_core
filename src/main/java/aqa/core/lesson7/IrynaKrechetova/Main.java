package aqa.core.lesson7.IrynaKrechetova;

public class Main {
    public static void main() {
        Shape shape1 = new Shape("GREEN");
        System.out.println(shape1.toString());

        Circle circle1 = new Circle("PINK", 10);
        System.out.println(circle1.toString());
        System.out.print("Shape area is: ");
        System.out.print(circle1.calcArea());

        Rectangle rectangle1 = new Rectangle("PURPLE", 11, 22);
        System.out.println(rectangle1.toString());
        System.out.print("Shape area is: ");
        System.out.println(rectangle1.calcArea());

        Triangle triangle1 = new Triangle("Grey", 5, 5, 5);
        System.out.println(triangle1.toString());
        System.out.print("Shape area is: ");
        System.out.println(triangle1.calcArea());

        Shape[] arr = new Shape[];
        arr[0] = new Rectangle("blue", 1,2);
        arr[1] = new Rectangle("blue", 1,3);
        arr[2] = new Rectangle("blue", 1,4);
        arr[3] = new Rectangle("blue", 1, 5);
        arr[4] = new Rectangle("blue", 1, 6);
        arr[5] = new Circle("pink", 5);
        arr[6] = new Circle("pink", 6);
        arr[7] = new Triangle("yellow",1,1,1);
        arr[8] = new Triangle("yellow", 2,2,2);

        double sumArea = 0;
        double sumCircleArea = 0;
        double sumRectangleArea = 0;
        double sumTriangleArea = 0;

        for (Shape x: arr) {
            System.out.println(x.toString());
            System.out.println("Shape area is: ");
            System.out.print(x.calcArea());
            sumArea = sumArea + x.calcArea();
            if (x instanceof Circle) {
                sumCircleArea = sumCircleArea + x.calcArea();
            }
            if (x instanceof Triangle) {
                sumTriangleArea = sumTriangleArea + x.calcArea();
            }
            if (x instanceof Rectangle) {
                sumRectangleArea = sumRectangleArea + x.calcArea();
            }
        }
        System.out.println("Total area = ");
        System.out.print(sumArea);

        System.out.println("Total area of Circles = ");
        System.out.print(sumCircleArea);

        System.out.println("Total area of Triangles = ");
        System.out.print(sumTriangleArea);

        System.out.println("Total area of Rectangles = ");
        System.out.print(sumRectangleArea);






    }

}
