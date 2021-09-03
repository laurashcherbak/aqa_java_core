package aqa.core.lesson10.yuliiaavrakhova;

public class Main {

    public static void main(String[] args) {
        try {
            throw new Exception("Error message");
        } catch (MyException e){
            System.out.println("My Exception catch");
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Exception catch");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally here");
        }

        try {
            MyTest.test();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }


    }

}
