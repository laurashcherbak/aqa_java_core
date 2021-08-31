package aqa.core.lesson8.akylo.nsobol8;

public class Main {
    public static void main(String[] args) {


        Shape[] array = {
                new Circle("Green", 9),
                new Triangle("Orange", 5, 5, 7),
                new Rectangle("Purple", 8, 6)
        };


        for (Shape x : array) {
            x.draw();
        }

        Rectangle r1 = new Rectangle("Purple", 8, 6);
        Rectangle r2 = new Rectangle("Purple", 12, 18);

//        r1.compareTo();

        Rectangle[] array1 = {
                new Rectangle("Purple", 8, 6),
                new Rectangle("Purple", 12, 18),
                new Rectangle("Purple", 14, 16),
                new Rectangle("Purple", 4, 10),
                new Rectangle("Purple", 10, 20),
                new Rectangle("Purple", 12, 22)
        };
//        Arrays.sort(array1);
        for (Rectangle x : array1) {
            x.draw();
        }

    }
}
