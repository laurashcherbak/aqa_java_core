package aqa.core.lesson10.ExceptionDemo.Vlasiuk;

public class Main {
    public static void main(String[] args) {
        Person Me = new Person();
        Me.setAge(22);
        try {
            Me.setAge(140);
        }
        catch (InvalidAgeException e) {
        }
    }
}
