package lesson10elenabeymart;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("First");
        String msg = "";
        try {
            System.out.println("try");
            msg = args[1];
        } catch (Exception e) {
            System.out.println("catch");
            System.out.println("msg");
        } finally {
            System.out.println("finally");
        }
        System.out.println("Second");
        System.out.println("try");
        System.out.println("Here is my error Message in Main.main()");
        throw new Exception("Here is my error Message in Main.main()");
    }

    private static void test() {
    }
}
