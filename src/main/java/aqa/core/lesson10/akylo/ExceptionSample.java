package aqa.core.lesson10.akylo;

public class ExceptionSample {

    public static void main(String[] arg)  {
        try {
            testExcp2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new RuntimeException();
    }

    public static void testExcp() {
        try {
            int x = 10 / 0;
        } catch (Exception ex) {
            System.out.println("catch");
            return;
        } finally {
            System.out.println("finally");
        }
    }

    public static int testExcp2() throws Exception{
        int y = 50;

            int x = 10 / 0;

        return x;
    }

}
