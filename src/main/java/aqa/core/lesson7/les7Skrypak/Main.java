package aqa.core.lesson7.les7Skrypak;

public class Main {
    public static void main (String[] args) {
        Shape shapeA = new Shape("white","Jane");
        System.out.println(shapeA);
        System.out.println(shapeA.calcArea());
        Circle circleA = new Circle("John", "blue", 35);
        System.out.println(circleA);
        System.out.println("Circle area is: " + circleA.calcArea());
        Rectangle rectangleA = new Rectangle("black", 7.8, 6.9);
        System.out.println(rectangleA);
        System.out.println("Rectangle area is: " + rectangleA.calcArea());
        Triangle triangleA = new Triangle("brown", "Jonny", 9.8, 7.9, 3.2);
        System.out.println(triangleA);
        System.out.println("Triangle area is: " + triangleA.calcArea());

        Shape[] arrFigures = new Shape[] {
                new Rectangle1("neon", 4.5, 8.7);
                new Rectangle2("blue", 9.8, 8.7);
                new Rectangle3("pink", 3.5, 1.7);
                new Rectangle4("milk", 2.5, 5.7);
                new Rectangle5("coral", 6.9, 6.6);
                new Circle1("white", 88);
                new Circle2("milky", 3);
                new Triangle1("magenta", 4, 5, 6);
                new Triangle2("magenta", 6, 8, 9);
        }
        for (Shape z: arrFigures) {
            System.out.println(z.toString() + " , area is" + z.calkArea());
        }


    }
}
