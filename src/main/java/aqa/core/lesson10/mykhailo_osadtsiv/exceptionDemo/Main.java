package aqa.core.lesson10.mykhailo_osadtsiv.exceptionDemo;

public class Main {
    public static void main(String[] args) {
        Person tester = new Person();
        tester.setAge(44);
        try {
            tester.setAge(125);
        } catch (InvalidAgeException e) {
        }
    }
}
