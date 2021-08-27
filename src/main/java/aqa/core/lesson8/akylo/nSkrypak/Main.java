package aqa.core.lesson8.akylo.nSkrypak;

import java.util.Arrays;

public class Main extends Shape{
    public Main(String shapeColor, String shapeName) {
        super(shapeColor, shapeName);
    }
    public static void main (String[] args) {
        //Shape shapeA = new Shape("white", "Jane");
        //System.out.println(shapeA);
        //System.out.println(shapeA.calcArea());
        Circle circleA = new Circle("John", "blue", 35);
        System.out.println(circleA);
        System.out.println("Circle area is: " + circleA.calcArea());
        Rectangle rectangleA = new Rectangle("black", "Bobby", 7.8, 6.8);
        System.out.println(rectangleA);
        System.out.println("Rectangle area is: " + rectangleA.calcArea());
        Triangle triangleA = new Triangle("brown", "Jonny", 9.8, 7.9, 3.2);
        System.out.println(triangleA);
        System.out.println("Triangle area is: " + triangleA.calcArea());

        Shape[] arrFigures = {
            new Rectangle("Neon", 4.5, 8.7),
            new Rectangle("blue", 9.8, 8.7),
            new Rectangle("pink", 3.5, 1.7),
            new Rectangle("milk", 2.5, 5.7),
            new Rectangle("coral", 6.9, 6.6),
            new Circle("John", "yellow", 88),
            new Circle("Minnie", "milky", 3),
            new Triangle("magenta", "Lola", 4, 5, 6),
            new Triangle("yellow", "Bob", 4, 5, 6)
        };
        Arrays.sort(arrFigures);
        for (Shape x : arrFigures) {
            System.out.println(x.toString() + " , area is" + x.calkArea());
        }
        for (Shape z : arrFigures) {
            System.out.println(z.draw());
        }

        double sumArea = 0.0;
        for(Shape x : arrFigures) {
            sumArea += x.calcArea();
        }
        System.out.println("Total: " + sumArea);

        double sumRectangleArea = 0.0;
        for(Shape x : arrFigures) {
            if (x instanceof Rectangle)
                sumRectangleArea += x.calcArea();
        }
        System.out.println("Rectangles total area: " + sumRectangleArea);

        double sumTriangleArea = 0.0;
        for(Shape x : arrFigures) {
            if (x instanceof Triangle)
                sumTriangleArea += x.calcArea();
        }
        System.out.println("Triangle total area: " + sumTriangleArea);

        double sumCircleArea = 0.0;
        for(Shape x : arrFigures) {
            if (x instanceof Circle)
                sumCircleArea += x.calcArea();
        }
        System.out.println("Circle total area: " + sumCircleArea);

    }

    @Override
    public double draw() {

        return 0;
    }

    @Override
    public double calcArea() {
        return 0;
    }
}
