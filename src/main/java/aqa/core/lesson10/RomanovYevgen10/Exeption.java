package aqa.core.lesson10.RomanovYevgen10;

public class Exeption extends Throwable {
    public Exeption(String s) {

    }

    public static void main(String[] args) throws Exeption {

        System.out.println("Part 1.");
        String s = "";
        try {
            System.out.println("try");
            s = args[1];
        } catch (Exception ex) {
            System.out.println("catch");
            System.out.println(s);
            return;
        } finally {
            System.out.println("finally");
        }
        //..
    }
}
