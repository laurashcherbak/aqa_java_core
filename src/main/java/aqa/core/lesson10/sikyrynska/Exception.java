package aqa.core.lesson10.sikyrynska;

public class Exception extends java.lang.Exception { public String s;
    public Exception(String s){ this.s = s;
    }
    public void printStoredString(){ System.out.println(this.s);
    }
}
