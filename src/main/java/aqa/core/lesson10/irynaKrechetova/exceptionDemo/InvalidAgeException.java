package aqa.core.lesson10.irynaKrechetova.exceptionDemo;

public class InvalidAgeException extends RuntimeException {

    private String message;
    public InvalidAgeException(String s) {
        this.message=s;
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
        System.out.println(message);
    }
}
