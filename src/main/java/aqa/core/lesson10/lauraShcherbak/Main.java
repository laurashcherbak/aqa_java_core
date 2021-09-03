package aqa.core.lesson10.lauraShcherbak;

import static aqa.core.lesson10.lauraShcherbak.MyTest.*;

public class Main {
    public static void main(String[] args) throws MyException {

        System.out.println("Task 1.");
        String s = "";
        try {
            System.out.println("try");
            s = args[1];
        } catch (Exception ex) {
            System.out.println("catch");
            System.out.println(s);
        } finally {
            System.out.println("finally");
        }

        System.out.println("Task 2.1.");
        try {
            System.out.println("try");
            System.out.println("This is My error Message in Main.main()");
            throw new MyException("This is My error Message in Main.main()");
        } catch(MyException ex) {
            System.out.println("catch");
            System.out.println(ex);
        }

        System.out.println("Task 2.2.");
        try {
            System.out.println("try");
            MyTest t = new MyTest();
            t.test();
        } catch (MyException ex) {
            System.out.println("catch");
            System.out.println(ex);
        }

    }
}
