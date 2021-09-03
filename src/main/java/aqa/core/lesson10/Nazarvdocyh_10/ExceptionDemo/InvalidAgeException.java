package aqa.core.lesson10.Nazarvdocyh_10.ExceptionDemo;



public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
        System.out.println("Age out of range 1-120");
    }
}
