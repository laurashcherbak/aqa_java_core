package aqa.core.lesson10;

public class MyException extends Exception {
    private String msg;

    public MyException (String msg) {
        this.msg = msg;
    }

    public void draw() {
        System.out.println(this.msg);
    }
}
