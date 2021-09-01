package aqa.core.lesson9.sikyrynska;

public class Main {
    public static void main(String[] args) {
        String myStr = "My best education project in GlobalLogic";
        System.out.println("Task1.3.a");
        System.out.println(myStr.indexOf("a"));
        System.out.println("Task1.3.b");
        System.out.println(myStr.lastIndexOf("b"));
        System.out.println("Task1.3.c");
        System.out.println(myStr.substring(3, 6));
        System.out.println("Task1.4");
        System.out.println(reverseString("Kvitoslava"));
        System.out.println("Task1.5");
        System.out.println(reverseString(myStr));
    }

    public static String reverseString (String in) {
        String out = "";
        for (int k = in.length() - 1; k >= 0; k--) {
            out += in.charAt(k);
        }
        return out;
    }
}
