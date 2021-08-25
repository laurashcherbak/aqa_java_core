package aqa.core.lesson7.MykhailoOsadtsiv;

public class Main {
    public static void main(String[] args) {
        Shape sh1 = new Shape("RED");
        System.out.println(sh1.toString());

        Circle si1 = new Circle("GREEN", 10);
        System.out.println(si1.toString());
        System.out.println("Shape area is : " + String.format("%.5f", si1.calcArea()));

        Rectange re1 = new Rectange("RED", 11, 22);
        System.out.println(re1.toString());
        System.out.println("Shape area is : " + String.format("%.0f",re1.calcArea()));

        Triangle tr1 = new Triangle("BLACK", 5, 5, 5);
        System.out.println(tr1.toString());
        System.out.println("Shape area is : " + String.format("%.3f",tr1.calcArea()));
    }
}
