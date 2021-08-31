package aqa.core.lesson10.vchorna.ExceptionDemo;

public class Main {
    public static void main(String[] args) {
        Person human = new Person();
        human.setAge(29);
        System.out.println(human.getAge());
        try {
            human.setAge(122);
            System.out.println(human.getAge());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

