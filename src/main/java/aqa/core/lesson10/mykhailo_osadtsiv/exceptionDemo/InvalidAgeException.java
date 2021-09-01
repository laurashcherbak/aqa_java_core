package aqa.core.lesson10.mykhailo_osadtsiv.exceptionDemo;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
        System.out.println("Age out of range 1-120");
    }
}
