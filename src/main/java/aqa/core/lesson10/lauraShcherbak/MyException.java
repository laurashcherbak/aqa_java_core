package aqa.core.lesson10.lauraShcherbak;

public class MyException extends Exception {
    private String s;

    MyException(String s) {
        this.s = s;
    }

    public String print() {
        return s;
    }

}
