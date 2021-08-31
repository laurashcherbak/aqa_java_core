package aqa.core.lesson7.LiubovPylypenko;

public class HomeTasks7 {

    public static void main(String[] args) {
        // Shape
        Shape shape = new Shape("RED");
        System.out.println(shape.toString());

        //Circle
        Circle circle = new Circle("GREEN", 10);
        System.out.println(circle.toString());
        System.out.println("Circle area is: " + circle.calcArea());

        //Rectangle
        Rectangle rectangle = new Rectangle("RED", 11, 22);
        System.out.println(rectangle.toString());
        System.out.println("Rectangle area is: " + rectangle.calcArea());

        //Triangle
        Triangle triangle = new Triangle("BLACK", 5, 5, 5);
        System.out.println(triangle.toString());
        System.out.println("Triangle area is: " + triangle.calcArea());

        Shape[] shapes = new Shape[] {
                new Rectangle("RED", 11, 22),
                new Rectangle("WHITE", 10, 21),
                new Rectangle("BLACK", 12, 24),
                new Rectangle("GREEN", 13, 15),
                new Rectangle("BLUE", 17, 30),
                new Circle("GREEN", 8),
                new Circle("RED", 10),
                new Triangle("BLACK", 5, 5, 5),
                new Triangle("WHITE", 12, 8, 6),
        };


        for (Shape shapeItem:shapes) {
            System.out.println(shapeItem.toString() + ", " + shapeItem.calcArea());
        }

        double sumArea = 0.0;
        double sumRectArea = 0.0;
        double sumCircleArea = 0.0;
        double sumTriangleArea = 0.0;

        for (Shape shapeItem:shapes) {
            double itemArea = shapeItem.calcArea();
            sumArea = sumArea + itemArea ;
            if (shapeItem instanceof Rectangle)   sumRectArea = sumRectArea + itemArea;
            if (shapeItem instanceof Circle)      sumCircleArea = sumCircleArea + itemArea;
            if (shapeItem instanceof Triangle)    sumTriangleArea = sumTriangleArea + itemArea;
        }

        System.out.println("All Shapes total area: " + sumArea);
        System.out.println("Rectangles total area: " + sumRectArea);
        System.out.println("Circles total area: " + sumCircleArea);
        System.out.println("Triangles total area: " + sumTriangleArea);
    }
}
