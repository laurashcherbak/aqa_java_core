package aqa.core.lesson8.alun;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
       Shape[] arr  =  {new Circle(1, "WHITE"),
                        new Circle(2, "BLUE"),
                        new Rectangle(1.0,1.0,"RED"),
                        new Rectangle(2.0,2.0,"INDIGO"),
                        new Rectangle(3.0,3.0,"GREEN"),
                        new Rectangle(4.0,4.0,"BLACK"),
                        new Rectangle(5.0,5.0,"ORANGE"),
                        new Triangle(1.0,1.0,1.0, "PURPLE"),
                        new Triangle(2.0,2.0,2.0, "YELLOW")
        };
        for(Shape i:arr) {
            System.out.println(i.toString()+", area is "+i.calcArea());
        }
        System.out.println("");
        Shape[] arr1 = {new Rectangle(11.0,22.0,"Red"),
                        new Circle(10, "Green"),
                        new Triangle(5.0,5.0,5.0, "Black")};
        for(Shape i:arr1) {
            i.Draw();
            System.out.println(i.toString()+", area is "+i.calcArea());
        }
        Rectangle[] arr2 = {
                new Rectangle(6.0,6.0,"RED"),
                new Rectangle(5.0,5.0,"INDIGO"),
                new Rectangle(4.0,4.0,"GREEN"),
                new Rectangle(3.0,3.0,"BLACK"),
                new Rectangle(2.0,2.0,"ORANGE"),
                new Rectangle(1.0,1.0,"ORANGE")
        };
        Arrays.sort(arr2);
        for(Rectangle y:arr2) {
            y.Draw();
        }
        Rectangle rectangle1 = new Rectangle(2.0,2.0,"ORANGE");
        Rectangle rectangle2 = new Rectangle(1.0,1.0,"ORANGE");
        int comp = rectangle1.compareTo(rectangle2);
        if (comp == 0) {
            System.out.println("Object 1 == Object 2");
        } else if (comp == 1) {
            System.out.println("Object 1 > Object 2");
        } else {
            System.out.println("Object 1 < Object 2");
        }
        Rectangle rectangle3 = new Rectangle(0.0,0.0,"WHITE");
        Rectangle rectangle4 = new Rectangle(0.0,0.0,"ORANGE");
        comp = rectangle1.compareTo(rectangle2);
        if (comp == 0) {
            System.out.println("Object 1 == Object 2");
        } else if (comp == 1) {
            System.out.println("Object 1 > Object 2");
        } else {
            System.out.println("Object 1 < Object 2");
        }
    }
}
