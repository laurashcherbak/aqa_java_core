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
    }
}

