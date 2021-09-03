package aqa.core.lesson10.yliiagnatuik;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Hello! This is an exception.");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("This is a finally block");
        }

        try {
            throw new MyException("Task 2 of homework 10");
        } catch (MyException exception) {
            exception.printText();
        }

        MyTest myTest = new MyTest();
        try {
            myTest.test();
        } catch (MyException e) {
            e.printText();
        }
    }
}

