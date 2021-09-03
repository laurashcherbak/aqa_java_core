package main.java.aqa.core.lesson10.akylo.virakrychkovska.ExeptionDemo;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
        System.out.println("Age out of range 1-120");
    }
}
