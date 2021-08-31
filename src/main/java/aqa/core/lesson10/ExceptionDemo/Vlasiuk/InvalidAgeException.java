package aqa.core.lesson10.ExceptionDemo.Vlasiuk;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
        System.out.println("Age is out of range 1-120");
    }
}