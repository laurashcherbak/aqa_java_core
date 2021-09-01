package aqa.core.lesson10.yesyp;

public class MyException extends Exception{
   String str;

    public MyException() {
        str ="";
    }

    public void Ex (String str)
    { this.str=str;
    }

    public String getStr() {
        return str;
    }
}


