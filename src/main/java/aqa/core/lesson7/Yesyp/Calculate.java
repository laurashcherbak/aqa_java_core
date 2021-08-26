package aqa.core.lesson7.Yesyp;

public class Calculate {
    public static void main(String[] args) {
        Shape s = new Shape();


        Circle c = new Circle();
        {
            c.setShapeColor("green");
            System.out.println(c);
            c.setRadius(10);
            c.calcArea(0);
        }

        Rectangle r = new Rectangle();
        r.setShapeColor("red");
        System.out.println(r);
        r.setHeight(10);
        r.setWidth(20);
        r.calcArea(0);

        Triangle t = new Triangle();
        t.setShapeColor("black");
        System.out.println(t);
        t.setA(10);
        t.setB(20);
        t.setC(15);
        t.calcArea(0);

    }
}
