package aqa.core.lesson7.knenko;

public class HomeWork7 {
    public static void main(String[] args) {
        Shape shape1 = new Shape("GREEN");
        System.out.println(shape1.toString());

        Circle circle1 = new Circle("BLUE", 7);
        Rectangle rectangle1 = new Rectangle("RED", 10, 4);
        Triangle triangle1 = new Triangle("YELLOW", 7, 7, 10);

        System.out.println(circle1);
        System.out.println("Circle area is: " + circle1.calcArea());
        System.out.println(rectangle1);
        System.out.println("Rectangle area is: " + rectangle1.calcArea());
        System.out.println(triangle1);
        System.out.println("Triangle area is: " + triangle1.calcArea());

        double shapeArea = 0;
        double RectangleArea = 0;
        double TriangleArea = 0;
        double CircleArea = 0;
        Shape[] array = new Shape[8];
        array[0] = new Rectangle("LIGHT BLUE", 4, 2);
        array[1] = new Rectangle("BROWN", 8, 4);
        array[2] = new Rectangle("DARK BLUE", 6, 6);
        array[3] = new Rectangle("PINK", 9, 5);
        array[5] = new Circle("YELLOW", 5);
        array[6] = new Circle("RED", 10);
        array[7] = new Triangle("GRAY", 9, 9, 9);
        array[4] = new Triangle("BLUE", 8, 4, 5);


        for (Shape shape : array) {
            System.out.println(shape.toString());
            System.out.println("Shape area: " + shape.calcArea());
            shapeArea += shape.calcArea();
            if (shape instanceof Rectangle) {
                RectangleArea += shape.calcArea();
            }
            if (shape instanceof Triangle) {
                TriangleArea += shape.calcArea();
            }
            if (shape instanceof Circle) {
                CircleArea += shape.calcArea();
            }
        }
        System.out.println("Total area:" + shapeArea);
        System.out.println("Total area of Rectangles: " + RectangleArea);
        System.out.println("Total area of Triangles: " + TriangleArea);
        System.out.println("Total area of Circles: " + CircleArea);
    }
}