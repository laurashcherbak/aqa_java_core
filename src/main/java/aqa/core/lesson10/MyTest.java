package aqa.core.lesson10;

public class MyTest {
    public void test() throws MyException
    {
        System.out.println("This is message");
        throw new MyException("This is MyTest");
    }
}
