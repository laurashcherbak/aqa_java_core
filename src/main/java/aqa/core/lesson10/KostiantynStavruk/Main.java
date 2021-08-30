package aqa.core.lesson10.KostiantynStavruk;

import aqa.core.lesson2.yesyp.Expression1;

public class Main {
    public static void main(String[] args) {

        String p = "P R O B L E M A";
        try {
            throw new Exception("Task1: " + p);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(p);
        } finally {
            System.out.println("Task1: finally");
        }

        try {
            throw new MyException("Task2: problem ");

        } catch (MyException e) {
            e.printStackTrace();
            e.print();
        }

        try {
            MyTest test = new MyTest();
            test.test();
        } catch (MyException e) {
            e.print();
        }
    }

}
