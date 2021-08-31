package elenabeymart;

public class TestShape {
    public static void main(String[] args) {
        //Rectangle test
        double width = 5, height = 7;
        Shape rectangle = new Rectangle(width, height);
        System.out.printf("Rectangle width: %s and height: %s\nResulting area: %s\nResulting perimeter: %s\n%n", width, height, rectangle.area(), ((Rectangle) rectangle).perimeter());
        //Circle test
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
                + "\nResulting area: " + ((Circle) circle).area()
                + "\nResulting perimeter: " + ((Circle) circle).perimeter() + "\n");
        //Triangle test
        double a = 5, b = 3, c = 4;
        Shape triangle = new Triangle(a, b, c);
        System.out.println("Triangle sides heights: " + a + ", " + b + ", " + c
                + "\nResulting area: " + triangle.area()
                + "\nResulting perimeter: " + ((Triangle) triangle).perimeter() + "\n");
    }
}
