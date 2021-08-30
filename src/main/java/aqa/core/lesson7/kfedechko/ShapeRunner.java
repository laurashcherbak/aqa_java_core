package aqa.core.lesson7.kfedechko;

public class ShapeRunner {

    public static void main(String[] args) {
        Shape shape = new Shape("RED");
        System.out.println(shape.toString());

        Circle circle = new Circle("Green", 22.0);
        System.out.print(circle.toString());
        System.out.println(" Shape area is: " + circle.calcArea());

        Rectangle rectangle = new Rectangle("red", 11.0, 22.0);
        System.out.print(rectangle.toString());
        System.out.println(" Shape area is: " + rectangle.calcArea());

        Triangle triangle = new Triangle("black", 5.0, 5.0, 5.0);
        System.out.print(triangle.toString());
        System.out.println(" Shape area is: " + triangle.calcArea());

        Rectangle rectangle1 = new Rectangle("red", 11.0, 22.0);
        Rectangle rectangle2 = new Rectangle("red", 11.0, 22.0);
        Rectangle rectangle3 = new Rectangle("red", 11.0, 22.0);
        Rectangle rectangle4 = new Rectangle("red", 11.0, 22.0);
        Rectangle rectangle5 = new Rectangle("red", 11.0, 22.0);
        Circle circle1 = new Circle("Green", 22.0);
        Circle circle2 = new Circle("Green", 22.0);
        Triangle triangle1 = new Triangle("black", 5.0, 5.0, 5.0);
        Triangle triangle2 = new Triangle("black", 5.0, 5.0, 5.0);

        Shape[] arr = {rectangle1, rectangle2, rectangle3, rectangle4, rectangle5, circle1, circle2, triangle1, triangle2};

        double sumAreaRectangle = 0.0;
        double sumAreaCircle = 0.0;
        double sumAreaTriangle = 0.0;
        for (Shape shapeEl : arr) {
            System.out.print(shapeEl.toString());
            System.out.println(" Shape area is: " + shapeEl.calcArea());
            if (shapeEl instanceof Rectangle) sumAreaRectangle += shapeEl.calcArea();
            if (shapeEl instanceof Circle) sumAreaCircle += shapeEl.calcArea();
            if (shapeEl instanceof Triangle) sumAreaTriangle += shapeEl.calcArea();
        }
        System.out.print("Rectangles total area: " + sumAreaRectangle + " ");
        System.out.print("Circle total area: " + sumAreaCircle + " ");
        System.out.print("Triangle total area: " + sumAreaTriangle);

    }

}
