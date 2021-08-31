package aqa.core.lesson7.ylliagnatuik;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        Shape shape = new Shape("GREEN");
        System.out.println(shape);

        System.out.println("Task2");
        Circle circle = new Circle("GREEN", 10);
        System.out.println(circle);
        System.out.println("Shape area is: " + circle.calcArea());

        System.out.println("Task3");
        Rectangle rectangle = new Rectangle("BLUE", 100, 200);
        System.out.println(rectangle);
        System.out.println("Shape area is: " + rectangle.calcArea());

        System.out.println("Task4");
        Triangle triangle = new Triangle("BLACK", 3, 3, 3);
        System.out.println(triangle);
        System.out.println("Shape area is: " + triangle.calcArea());

        System.out.println("Task5");
        Shape[] shapes = new Shape[]{
                new Rectangle("BLUE", 100, 200),
                new Rectangle("RED", 200, 300),
                new Rectangle("BLACK", 400, 500),
                new Rectangle("YELLOW", 600, 700),
                new Rectangle("GREEN", 800, 900),
                new Circle("GREEN", 89),
                new Circle("WHITE", 13),
                new Triangle("BLACK", 36, 36, 36),
                new Triangle("ORANGE", 2, 2, 2)
        };

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            System.out.println("Shape area is: " + shapes[i].calcArea());
        }

        double sum = 0.0;
        for (int i = 0; i < shapes.length; i++) {
            sum = sum + shapes[i].calcArea();
        }
        System.out.println("Total sum oa areas: " + sum);

        double recTotal = 0.0;
        double cirTotal = 0.0;
        double triTotal = 0.0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Rectangle) {
                recTotal = recTotal + shapes[i].calcArea();
            }
            if (shapes[i] instanceof Circle) {
                cirTotal = cirTotal + shapes[i].calcArea();
            }
            if (shapes[i] instanceof Triangle) {
                triTotal = triTotal + shapes[i].calcArea();
            }
        }

        System.out.println("Rectangles total area: " + recTotal);
        System.out.println("Circle total area: " + cirTotal);
        System.out.println("Triangle total area: " + triTotal);

    }
}

