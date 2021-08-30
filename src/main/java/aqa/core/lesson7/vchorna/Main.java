package aqa.core.lesson7.vchorna;

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape("Red");
        System.out.println(s);

        Circle c = new Circle("Green", 22);
        System.out.println(c);

        Rectangle r = new Rectangle("Purple", 20, 10);
        System.out.println(r);

        Triangle t = new Triangle("Orange", 4, 4, 4);
        System.out.println(t);

        Shape[] arr = new Shape[]{
                new Circle("Green", 5),
                new Circle("Green", 9),
                new Triangle("Orange", 2, 4, 6),
                new Triangle("Orange", 3, 5, 7),
                new Rectangle("Purple", 8, 6),
                new Rectangle("Purple", 4, 6),
                new Rectangle("Purple", 12, 16),
                new Rectangle("Purple", 14, 18),
                new Rectangle("Purple", 11, 22)
        };

        double sumCircle = 0;
        double sumTriangle = 0;
        double sumRectangle = 0;

        for (Shape x : arr) {
            double z = x.calcArea();
            System.out.println(x + ", area is: " + z);

            if (x instanceof Circle){
                sumCircle += z;
            }
            if (x instanceof Rectangle) {
                sumRectangle += z;
            }
            if (x instanceof Triangle) {
                sumTriangle += z;
            }
        }
        System.out.println("Total area Circle is " + sumCircle);
        System.out.println("Total area Triangle is " + sumTriangle);
        System.out.println("Total area Rectangle is " + sumRectangle);
    }
}

