package aqa.core.lesson7.lesson7kapusniak;

public class Main {
    public static void main(String [] arg) {
        Shape shape1 = new Shape("RED", "");


        Circle circle1 = new Circle("GREEN", "",10);

        System.out.println("Shape area is: ");
        System.out.println(circle1.calcArea());

        Rectangle rectangle1 = new Rectangle("BLUE", "", 10, 15);
        System.out.println("Shape area is: ");
        System.out.println(rectangle1.calcArea());










    }
}
