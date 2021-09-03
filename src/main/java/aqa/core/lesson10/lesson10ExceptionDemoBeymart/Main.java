package aqa.core.lesson10.lesson10ExceptionDemoBeymart;

public class Main {
    public static void main(String[] args) {
        System.out.println("Third");
        Person one = new Person();
        try {
            one.setAge(0);
        } catch (Exception msg) {
            System.out.println("ExceptionDemo.main - ErrorAge");
            System.out.println("msg");
        }
    }
}
