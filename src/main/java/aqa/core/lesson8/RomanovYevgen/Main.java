package aqa.core.lesson8.RomanovYevgen;
import aqa.core.lesson7.RomanovYevgen.Circle;
import aqa.core.lesson7.RomanovYevgen.Rectangle;
import aqa.core.lesson7.RomanovYevgen.Shape;
import aqa.core.lesson7.RomanovYevgen.Triangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part 1: ");
        aqa.core.lesson7.RomanovYevgen.Shape shape = new aqa.core.lesson7.RomanovYevgen.Shape("RED");
        System.out.println(shape.toString());

        System.out.println("\nPart 2: ");
        aqa.core.lesson7.RomanovYevgen.Circle circle = new aqa.core.lesson7.RomanovYevgen.Circle("GREEN", 10);
        System.out.println(circle.toString());
        System.out.println("Shape area is: " + circle.calcArea());

        System.out.println("\nPart 3: ");
        aqa.core.lesson7.RomanovYevgen.Rectangle rectangle = new aqa.core.lesson7.RomanovYevgen.Rectangle("RED", 11, 22);
        System.out.println(rectangle.toString());
        System.out.println("Shape area is: " + rectangle.calcArea());

        System.out.println("\nPart 4: ");
        aqa.core.lesson7.RomanovYevgen.Triangle triangle = new aqa.core.lesson7.RomanovYevgen.Triangle("BLACK", 5, 5, 5);
        System.out.println(triangle.toString());
        System.out.println("Shape area is: " + triangle.calcArea());

        System.out.println("\nPart 5: ");

        aqa.core.lesson7.RomanovYevgen.Shape[] arr = {new aqa.core.lesson7.RomanovYevgen.Rectangle("RED", 11, 22),
                new aqa.core.lesson7.RomanovYevgen.Rectangle("RED", 11, 22),
                new aqa.core.lesson7.RomanovYevgen.Rectangle("RED", 11, 22),
                new aqa.core.lesson7.RomanovYevgen.Rectangle("RED", 11, 22),
                new aqa.core.lesson7.RomanovYevgen.Rectangle("RED", 11, 22),
                new aqa.core.lesson7.RomanovYevgen.Circle("GREEN", 10),
                new aqa.core.lesson7.RomanovYevgen.Circle("GREEN", 10),
                new aqa.core.lesson7.RomanovYevgen.Triangle("BLACK", 5, 5, 5),
                new aqa.core.lesson7.RomanovYevgen.Triangle("BLACK", 5, 5, 5)};

        for (aqa.core.lesson7.RomanovYevgen.Shape x : arr) {
            System.out.println(x.toString() + ", area is " + x.calcArea());
        }

        double sumArea = 0.0;
        for (aqa.core.lesson7.RomanovYevgen.Shape x : arr) {
            sumArea += x.calcArea();
        }
        System.out.println("Sum total: " + sumArea);

        double sumRectArea = 0.0;
        for (aqa.core.lesson7.RomanovYevgen.Shape x : arr) {
            if (x instanceof Rectangle)
                sumRectArea += x.calcArea();
        }
        System.out.println("Rectangles total area: " + sumRectArea);

        double sumTriangleArea = 0.0;
        for (aqa.core.lesson7.RomanovYevgen.Shape x : arr) {
            if (x instanceof Triangle)
                sumTriangleArea += x.calcArea();
        }
        System.out.println("Triangle total area: " + sumTriangleArea);

        double sumCircleArea = 0.0;
        for (Shape x : arr) {
            if (x instanceof Circle)
                sumCircleArea += x.calcArea();
        }
        System.out.println("Circle total area: " + sumCircleArea);

    }
}
