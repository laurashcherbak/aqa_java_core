package aqa.core.lesson10.alun;

public class Main {
    public static void main(String [] args) throws MyException {
      System.out.println("Task1");
        try {
            int x = 1 / 0;
        } catch (Exception ex) {
            System.out.println("if division by zero - catch 1");
        } finally {
            System.out.println("finally 1");
        }
      System.out.println("Task2");
        try {
            throw new Exception("error 2.1");
        } catch (MyException ex21){
            System.out.println(ex21.getMessage());
        } catch (Exception ex21){
            System.out.println("catch 2.1");
            System.out.println(ex21.getMessage());
        } finally {
            System.out.println("finally 2.1");
        }

        try {
            MyTest.test();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}