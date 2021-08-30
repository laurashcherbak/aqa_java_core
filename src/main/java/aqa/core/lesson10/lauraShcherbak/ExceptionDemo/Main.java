package aqa.core.lesson10.lauraShcherbak.ExceptionDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 3.");
        Person p = new Person();
        try {
            p.setAge(0);
        } catch (InvalidAgeException ex){
            System.out.println("ExceptionDemo.main - Invalid Age");
            System.out.println(ex);
        }
    }
}
