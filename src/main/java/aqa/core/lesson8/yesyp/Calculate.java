package aqa.core.lesson8.yesyp;


public class Calculate {
    public static void main(String[] args) {

        System.out.println("");

        Drawable c = new Circle("green", 10);
        System.out.println(c);
        c.draw();

        System.out.println("");

        Drawable r = new Rectangle(1, "red", 11, 22);
        System.out.println(r);
        r.draw();

        System.out.println("");

        Drawable t = new Triangle("black", 5, 5, 5);
        System.out.println(t);
        t.draw();

    }
}

