package aqa.core.lesson10.Nazarvdocyh_10;

public class MyException extends Exception{
    String str1;

    MyException(String str2) {
        str1=str2;
    }
    public String toString(){
        return ("MyException: "+str1) ;
    }
}



