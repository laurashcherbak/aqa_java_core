package aqa.core.lesson9.vchorna;

public class Main {

    public static void main(String[] args) {
        String myStr = "My best education project in GlobalLogic";
        int i1 = myStr.indexOf('a');
        int i2 = myStr.indexOf('b');
        String substr1 = myStr.substring(3, 6);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(substr1);
        System.out.println(reverseString(myStr));
    }

    private static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();

//        int length = s.length();
//        StringBuilder builder = new StringBuilder(length);
//        for (int i = length - 1; i >= 0; i--) {
//            builder.append(s.charAt(i));
//        }
//        return builder.toString();

    }
}
