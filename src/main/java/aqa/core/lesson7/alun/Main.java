package aqa.core.lesson7.alun;

public class Main {

    public static void main(String[] args) {
        double Sc=0, Sr=0, St=0;
        Shape[] arr =  {new Circle(1, "WHITE"),
                        new Circle(2, "BLUE"),
                        new Rectangle(1.0,1.0,"RED"),
                        new Rectangle(2.0,2.0,"INDIGO"),
                        new Rectangle(3.0,3.0,"GREEN"),
                        new Rectangle(4.0,4.0,"BLACK"),
                        new Rectangle(5.0,5.0,"ORANGE"),
                        new Triangle(1.0,1.0,1.0, "PURPLE"),
                        new Triangle(2.0,2.0,2.0, "YELLOW")
        };
        for(Shape o:arr) {
            if (o instanceof Circle)
                Sc += o.calcArea();
            System.out.println(o+"Circle Area is: "+Sc);
        }
        for(Shape r:arr) {
            if (r instanceof Rectangle)
                Sr += r.calcArea();
            System.out.println(r+"Circle Area is: "+Sr);
        }
        for(Shape t:arr) {
            if (t instanceof Triangle)
                St += t.calcArea();
            System.out.println(t+"Circle Area is: "+St);
        }
    }
}
