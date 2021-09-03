package aqa.core.lesson10.Tymofiiuk;

public class MyException extends Exception {
    String string1;

    MyException(String string2) {
        string1=string2;
    }
    public String toString(){
        return ("MyException: " + string1) ;
    }
}