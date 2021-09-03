package aqa.core.lesson10.kuchabskahaluna;

public class MyException extends Exception {
    private String message;
    public MyException(String message) {
        super(message);
        this.message = message;
    }

    public void printError() {
        System.out.println(this.message);
    }
}
