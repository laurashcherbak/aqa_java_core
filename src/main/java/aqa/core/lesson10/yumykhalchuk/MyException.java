package main.java.aqa.core.lesson10.yumykhalchuk;

public class MyException extends Exception{
    private String str;
    public MyException(String str){
       this.str = str;
    }

    public void printStoredString(){
        System.out.println(this.str);
    }
}
