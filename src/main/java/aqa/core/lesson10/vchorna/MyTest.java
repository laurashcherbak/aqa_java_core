package aqa.core.lesson10.vchorna;

public class MyTest extends Throwable {
    public static void test() throws MyException {
        throw new MyException("Test");

    }

    public static void main(String[] args) {
        try {
            test();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
