package aqa.core.lesson10.Nazarvdocyh_10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1 Test");
        try {
            String msg = "This is Task1";
            throw new Exception(msg);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is finally block");
        }
        try{
            System.out.println("Starting of try block");

            throw new MyException("This is My error Message");
        }
        catch(MyException exp){
            System.out.println("Catch Block") ;
            System.out.println(exp) ;
        }

        try {
            System.out.println("myclass error");
            MyClass Test = new MyClass();
            Test.MyTest();
        } catch (MyException ex) {
            System.out.println("catch");
            System.out.println(ex);
        }
    }


}

