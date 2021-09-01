package aqa.core.lesson8.virakrychkovska;

class TestInterface {

    public static void main(String args[]) {
        Drawable c = new Circle();
        c.draw();
        Drawable r = new Rectangle();
        r.draw();
        Drawable t = new Triangle();
        t.draw();
    }
}
