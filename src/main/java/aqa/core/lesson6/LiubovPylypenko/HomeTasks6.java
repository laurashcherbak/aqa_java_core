package aqa.core.lesson6.LiubovPylypenko;

public class HomeTasks6 {

    public static void main(String[] args) {
        // Shape
        // shape1
        Shape shape1 = new Shape("Some shape");
        System.out.println("Shape name: " + shape1.toString()
                + "\nResulting area: " + shape1.area()
                + "\nResulting perimeter: " + shape1.perimeter() + "\n");

        //shape2
        Shape shape2 = new Shape("Some shape");
        System.out.println(shape1.toString() + "1 hashCode: " + shape1.hashCode());
        System.out.println(shape2.toString() + "2 hashCode: " + shape2.hashCode());
        System.out.println("Is shape2 is equal to shape1? " + shape2.equals(shape1)  + "\n");

        //set different color
        shape2.setColor("Red");
        System.out.println(shape1.toString() + "1 hashCode: " + shape1.hashCode());
        System.out.println(shape2.toString() + "2 hashCode: " + shape2.hashCode());
        System.out.println("Is shape2 is equal to shape1? " + shape2.equals(shape1) + "\n");

        // Rectangle
        double width = 6, length = 8;
        Shape rectangle = new Rectangle("Some rectangle", width, length);
        System.out.println("Rectangle name: " + rectangle.toString() + "\n"
                + "Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + rectangle.area()
                + "\nResulting perimeter: " + rectangle.perimeter() + "\n");

        // Circle
        double radius = 6;
        Shape circle = new Circle("Some circle", radius);
        System.out.println("Circle name: " + circle.toString()  + "\n"
                + "Circle radius: " + radius
                + "\nResulting Area: " + circle.area()
                + "\nResulting Perimeter: " + circle.perimeter() + "\n");

    }
}