package aqa.core.lesson10.Tymofiiuk;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Start ");
            throw new MyException("Error :( ");
        } catch (MyException e) {
            System.out.println("Done ");
            System.out.println(e);
        } finally {
            System.out.println("Finish ");

        }
    }
}





