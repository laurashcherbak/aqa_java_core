package aqa.core.lesson7.Yesyp;

public class Calculate {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.setArea(0);
        s.setShapeColor("white");
        System.out.println(s);

        System.out.println("");

        Circle c = new Circle();
        c.setShapeColor("green");
        System.out.println(c);
        c.setRadius(11);
        c.calcArea(11);

        System.out.println("");

        Rectangle r = new Rectangle();
        r.setShapeColor("red");
        System.out.println(r);
        r.setHeight(10);
        r.setWidth(20);
        r.calcArea(0);

        System.out.println("");

        Triangle t = new Triangle();
        t.setShapeColor("black");
        System.out.println(t);
        t.setA(10);
        t.setB(20);
        t.setC(15);
        t.calcArea(0);


    }
}
