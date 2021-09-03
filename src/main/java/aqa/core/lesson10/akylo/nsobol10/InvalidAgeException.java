package aqa.core.lesson10.akylo.nsobol10;

public class InvalidAgeException extends Throwable {
    public static class invalidAgeException extends RuntimeException {
        public invalidAgeException() {
            System.out.println("Age is out of range 1-120");


        }
    }
}

