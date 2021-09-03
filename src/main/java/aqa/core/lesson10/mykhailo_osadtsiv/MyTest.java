package aqa.core.lesson10.mykhailo_osadtsiv;

public class MyTest {
    public static void main(String[] args) {
        try {
            test();
        } catch (MyException c) {
            System.out.println(c.getErrorMessage());
        }
    }

    public static void test () throws MyException {
        throw new MyException("Task 2.2 error message");
    }
}
