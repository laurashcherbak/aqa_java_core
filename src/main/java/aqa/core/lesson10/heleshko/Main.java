package aqa.core.lesson10.heleshko;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("Homework Task1");
        } catch (Exception e) {
            System.out.println("Exception, hello!");
        } finally {
            System.out.println("Finally!");
        }

        System.out.println("Here we are");

        try {
            throw new MyException("Homework Task2 Error");
        } catch (MyException d) {
            d.myExceptionPrint();
        }
    }
}
