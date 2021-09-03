package aqa.core.lesson10.alun;

public class MyException extends Exception{
    public  MyException (String str){
        super (str);
    }
    public void prnt () {
        System.out.println(this.getMessage());
    }
}
