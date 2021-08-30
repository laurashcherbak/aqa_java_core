package aqa.core.lesson7.sikyrynska7;

public class lesson7 {
    public static void main(String[] args) {
        double ShapeC = 0;
        double ShapeR = 0;
        double ShapeT = 0;
        Shape[] arr = {new Circle(2, "RED"),
                new Circle(2, "BLUE"),
                new Rectangle(1.4, 1.5, "BLUE"),
                new Rectangle(5.0, 1.2, "GRAY"),
                new Rectangle(3.3, 2.9, "YELLOW"),
                new Rectangle(4.2, 4.6, "BLACK"),
                new Triangle(2.9, 2.2, 2.7, "PINK"),
                new Triangle(1.1, 1.1, 1.1, "GREEN")
        };

        for (Shape r : arr) {
            if (r instanceof Rectangle)
                ShapeR += r.calcArea();
            System.out.println(r + "Rectange Area is: " + ShapeR);
        }
        for (Shape t : arr) {
            if (t instanceof Triangle)
                ShapeT += t.calcArea();
            System.out.println(t + "Triangle Area is: " + ShapeT);
        }
        for (Shape o : arr) {
            if (o instanceof Circle)
                ShapeC += o.calcArea();
            System.out.println(o + "Circle Area is: " + ShapeC);
        }
    }
}
