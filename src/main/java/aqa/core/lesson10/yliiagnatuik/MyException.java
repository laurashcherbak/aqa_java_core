package aqa.core.lesson10.yliiagnatuik;

public class MyException extends Exception {
    private String text;

    public MyException(String text) {
        this.text = text;
    }

    public void printText() {
        System.out.println(text);
    }
}

