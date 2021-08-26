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
        double sumArea = 0.0;
        double sumCircle = 0.0;
        double sumTriangle = 0.0;
        double sumRectangle = 0.0;
        int i = 0;
        for (int i = 0, arrLength = arr.length; i < arrLength; i++) {
            Shape variant = arr[i];
            System.out.println(variant + " area is: " + variant.calcArea());
        }
        if (arr[i] instanceof Circle) sumCircle += arr[i].callArea();
            if (arr[i] instanceof Rectangle) sumRectangle = (double) (sumRectangle + arr[i].calcArea ());
            if (arr[i] instanceof Triangle) sumTriangle = (double) (sumTriangle + arr[i].calcArea());
    }
}

