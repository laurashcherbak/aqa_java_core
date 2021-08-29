package aqa.core.lesson7;

public class Main {
    public static void main(String[] args) {

        Circle testCircle = new Circle("yellow", "circle", 2.0);
        System.out.println(testCircle);
        System.out.println("Area: " + testCircle.calcArea());

        Triangle testTriangle = new Triangle("yellow", "triangle", 2.0 , 5.0 , 4.0);
        System.out.println(testTriangle);
        System.out.println("Area: " + testTriangle.calcArea());

        Rectangle testRectangle = new Rectangle("yellow", "rectangle", 5.0 , 4.0 , 4.0, 5.0);
        System.out.println(testRectangle);
        System.out.println("Area: " + testRectangle.calcArea());
    }
}
