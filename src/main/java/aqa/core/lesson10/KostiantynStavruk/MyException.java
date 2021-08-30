package aqa.core.lesson10.KostiantynStavruk;

public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

    public void print() {
        System.out.println("Task2: " + getMessage());
    }
}
