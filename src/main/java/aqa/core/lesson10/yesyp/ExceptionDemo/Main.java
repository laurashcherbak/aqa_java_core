package aqa.core.lesson10.yesyp.ExceptionDemo;

public class Main {
    public static void main(String[] args) {
        Person person1= new Person("Olya", "Yesyp", 29);
        try {
            person1.setAge(123);
        } catch (InvalidAgeException in) {
            System.out.println("Error: " + in.getMessage());
        }
    }
}
