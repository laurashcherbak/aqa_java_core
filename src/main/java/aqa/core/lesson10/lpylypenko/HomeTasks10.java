package aqa.core.lesson10.lpylypenko;

public class HomeTasks10 {

    public static void main(String[] arg) {
        System.out.println("Task1");

        try {
            throw new Exception("Hello Exception!");
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("I was here!");
        }

        System.out.println("Task2");

        try {
            throw new MyException("Hello MyException!");
        }
        catch (MyException e) {
            e.draw();
        }

        try {
            MyTest t = new MyTest();
            t.test();
        }
        catch (MyException e) {
            System.out.println(e);
        }

    }
}
