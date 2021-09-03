package main.java.aqa.core.lesson10.yumykhalchuk;
public class MainEx {
    public static void main(String[] args) {

        System.out.println("Task 1:");

       try {
            System.out.println("Intro to exception");
            throw new Exception("Simple exception");
       }catch (Exception myFirstException){
            System.out.println("Catch my exception");
            System.out.println(myFirstException.getMessage());

       }finally {
           System.out.println("Finally, the end");
       }

        System.out.println("Task 2:");

        MyTest myTest = new MyTest();
        try {
            myTest.test();
        } catch (MyException myE) {
            myE.printStoredString();
        }

        try{
            System.out.println("My new exception");
            throw new MyException("Testing my new exception");
        }catch(MyException myE){
            System.out.println("Testing print method");
            myE.printStoredString();
        }
    }

}
