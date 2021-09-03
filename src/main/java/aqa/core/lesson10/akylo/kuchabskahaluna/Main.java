package main.java.aqa.core.lesson10.akylo.kuchabskahaluna;

public class Main {
    public static void main(String[] args) {

        //Task 1
        try {
            System.out.println("Before exception");
            throw new Exception("Test exception");
        } catch (Exception e) {
            System.out.println("Catch exception");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block");
        }

        //Task 2
        try {
            System.out.println("Before custom exception");
            throw new MyException("Test custom exception");
        } catch (MyException e) {
            System.out.println("Catch custom exception");
            e.printError();
        } catch (Exception e2) {
            System.out.println("Catch general exception");
            System.out.println(e2.getMessage());
        }

        MyTest testObj = new MyTest();
        try {
            testObj.test();
        } catch (MyException e) {
            e.printError();
        }

        // Task3
        Person person = new Person();
        try {
            person.setAge(1000);
        } catch (RuntimeException e) {
            System.out.println("Runtime exception catch");
            System.out.println(e.getMessage());
        }


    }
}
