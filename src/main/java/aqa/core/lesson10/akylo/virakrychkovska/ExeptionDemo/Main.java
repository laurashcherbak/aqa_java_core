package aqa.core.lesson10.akylo.virakrychkovska.ExeptionDemo;

public class Main {
    public static void main(String[] args) {
        Person tester = new Person();
        tester.setAge(22);
        try {
            tester.setAge(23);
        }
        catch (InvalidAgeException e) {
        }
    }
}
