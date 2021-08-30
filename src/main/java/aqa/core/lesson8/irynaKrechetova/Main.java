package aqa.core.lesson8.irynaKrechetova;

public class Main {
    public static void main(String [] ars) {
        Shape shape1 = new Shape("GREEN") {
            @Override
            public void draw() {}

            @Override
            double calcArea() { return 0; }
        };
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


        Rectangle rectangle2 = new Rectangle("orange", 2, 2);
        Rectangle rectangle3 = new Rectangle("orange", 3, 3);
        Rectangle rectangle4 = new Rectangle("orange", 4, 4);
        Rectangle rectangle5 = new Rectangle("orange", 5, 5);
        Rectangle rectangle6 = new Rectangle("orange", 6, 6);
        Circle circle2 = new Circle("pink", 5);
        Circle circle3 = new Circle("pink", 6);
        Triangle triangle2 = new Triangle("yellow", 1, 1, 1);
        Triangle triangle3 = new Triangle("yellow", 2, 2, 2);

        Shape[] arr = new Shape[]{rectangle2, rectangle3, rectangle4, rectangle5, rectangle6, circle2, circle3, triangle2, triangle3};

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
        System.out.println(sumArea);

        System.out.println("Total area of Circles = ");
        System.out.println(sumCircleArea);

        System.out.println("Total area of Triangles = ");
        System.out.println(sumTriangleArea);

        System.out.println("Total area of Rectangles = ");
        System.out.println(sumRectangleArea);

        for (Shape x : arr) {x.draw();}
        }

    }


