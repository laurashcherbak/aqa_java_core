package main.java.aqa.core.lesson10.vriaboshapka;

public class Main {
    public static void main(String[]arg) {
        try{
            String mes="I am here";
           throw new Exception(mes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("I was there");
        }
        try {
            throw new MyException("Say yes");
        } catch (MyException e) {
            e.printMyMes();
        }
        try{
            MyTest.test();
        } catch (MyException e) {
            e.printMyMes();
        }

    }
}
