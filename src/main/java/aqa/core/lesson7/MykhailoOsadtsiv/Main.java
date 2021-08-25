package aqa.core.lesson7.MykhailoOsadtsiv;

public class Main {
    public static void main(String[] args) {
        Shape sh1 = new Shape("RED");
        System.out.println(sh1.toString());

        Circle si1 = new Circle("GREEN", 10);
        System.out.println(si1.toString());

        System.out.println("Shape area is : " + String.format("%.5f", si1.calcArea()));
    }
}
