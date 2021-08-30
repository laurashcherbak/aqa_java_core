package aqa.core.lesson10.lauraShcherbak;

public class MyTest {
    public void test() throws MyException
    {
        System.out.println("This is My error Message in MyTest.test()");
        throw new MyException("This is My error Message in MyTest.test()");
    }
}
