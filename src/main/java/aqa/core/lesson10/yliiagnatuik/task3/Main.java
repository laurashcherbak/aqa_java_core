package aqa.core.lesson10.yliiagnatuik.task3;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            person.setAge(130);
        } catch (InvalidAgeException exception) {
            System.out.println("The age is invalid. Allowed range is 1-120.");
        }
    }
}

