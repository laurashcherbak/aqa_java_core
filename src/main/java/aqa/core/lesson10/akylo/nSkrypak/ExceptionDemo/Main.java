package aqa.core.lesson10.akylo.nSkrypak.ExceptionDemo;

public class Main {
    public static void main(String[] args) {
        Person onePerson = new Person();
        onePerson.setAge(34);
        try {
            onePerson.setAge(235);
        } catch (InvalidClassException e) {
            System.out.println("Not an age");
        }
    }

}
