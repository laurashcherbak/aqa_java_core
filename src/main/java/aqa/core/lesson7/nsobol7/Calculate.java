package aqa.core.lesson7.nsobol7;

//import java.awt.*;
//import java.awt.geom.AffineTransform;
//import java.awt.geom.PathIterator;
//import java.awt.geom.Point2D;
//import java.awt.geom.Rectangle2D;

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

        Triagle.Triangle t = new Triagle.Triangle();
        t.setShapeColor("black");
        System.out.println(t);
        t.setA(10);
        t.setB(20);
        t.setC(15);
        t.calcArea(0);

    }
}
