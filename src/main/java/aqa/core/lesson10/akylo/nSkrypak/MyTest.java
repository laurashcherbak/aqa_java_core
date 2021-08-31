package aqa.core.lesson10.akylo.nSkrypak;

public class MyTest {
    public void test() throws MyException{
        MyException myexception = new MyException();
        throw new MyException("My new exception");

    }
}
