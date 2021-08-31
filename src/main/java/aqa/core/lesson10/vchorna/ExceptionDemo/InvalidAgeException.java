package aqa.core.lesson10.vchorna.ExceptionDemo;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}
