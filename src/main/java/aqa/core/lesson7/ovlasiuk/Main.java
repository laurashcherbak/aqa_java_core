package aqa.core.lesson7.ovlasiuk;

//Task5
public class Main {

    public static void main(String[] args) {
        System.out.println("Part 1: ");
        Shape shape = new Shape("RED");
        System.out.println(shape.toString());

        System.out.println("\nPart 2: ");
        Circle circle = new Circle("GREEN", 10);
        System.out.println(circle.toString());
        System.out.println("Shape area is: " + circle.calcArea());

        System.out.println("\nPart 3: ");
        Rectangle rectangle = new Rectangle("RED", 11, 22);
        System.out.println(rectangle.toString());
        System.out.println("Shape area is: " + rectangle.calcArea());

        System.out.println("\nPart 4: ");
        Triangle triangle = new Triangle("BLACK", 5, 5, 5);
        System.out.println(triangle.toString());
        System.out.println("Shape area is: " + triangle.calcArea());

        System.out.println("\nPart 5: ");

        Shape[] arr = {new Rectangle("RED", 11, 22),
                new Rectangle("RED", 11, 22),
                new Rectangle("RED", 11, 22),
                new Rectangle("RED", 11, 22),
                new Rectangle("RED", 11, 22),
                new Circle("GREEN", 10),
                new Circle("GREEN", 10),
                new Triangle("BLACK",5,5,5),
                new Triangle("BLACK",5,5,5)};

        for(Shape x:arr) {
            System.out.println(x.toString()+", area is "+x.calcArea());
        }

        double sumArea = 0.0;
        for(Shape x:arr) {
            sumArea += x.calcArea();
        }
        System.out.println("Sum total: " + sumArea );

        double sumRectArea = 0.0;
        for(Shape x:arr) {
            if (x instanceof Rectangle)
                sumRectArea += x.calcArea();
        }
        System.out.println("Rectangles total area: " + sumRectArea );

        double sumTriangleArea = 0.0;
        for(Shape x:arr) {
            if (x instanceof Triangle)
                sumTriangleArea += x.calcArea();
        }
        System.out.println("Triangle total area: " + sumTriangleArea );

        double sumCircleArea = 0.0;
        for(Shape x:arr) {
            if (x instanceof Circle)
                sumCircleArea += x.calcArea();
        }
        System.out.println("Circle total area: " + sumCircleArea );

    }
}
