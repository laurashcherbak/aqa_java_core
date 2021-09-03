package aqa.core.lesson10;

public class Main {
    public static void main(String[] args) {
        try {
            String msg = "This is Task1!";
            throw new Exception(msg);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I was here");
        }
    }
}
