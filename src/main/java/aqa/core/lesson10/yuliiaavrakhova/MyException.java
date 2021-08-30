package aqa.core.lesson10.yuliiaavrakhova;

public class MyException extends Exception{

    public MyException(String message) {
        super(message);
    }

    public void printErrorMessage(){
        System.out.println(this.getMessage());
    }
}
