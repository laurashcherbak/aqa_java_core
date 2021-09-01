package aqa.core.lesson10.yesyp;

public class Main {
    public static void main(String[] args) {
        try {
            String s = "";
        } catch (Exception e) {
            System.out.println("aaa");
            e.printStackTrace();
        } finally {
            System.out.println("bbb");
        }

        try {
            MyException ex = new MyException();
        String str = ex.getStr();
        }
        catch (Exception e) {
            System.out.println("error: "+e.getMessage());
        }
    }
}

