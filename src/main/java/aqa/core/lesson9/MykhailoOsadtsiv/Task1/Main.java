package aqa.core.lesson9.MykhailoOsadtsiv.Task1;

public class Main {
    public static void main(String[] args) {
        String myStr = "My best education project in GlobalLogic";
        System.out.println(myStr.indexOf("a"));
        System.out.println(myStr.lastIndexOf("b"));
        System.out.println(myStr.substring(3, 6));
        System.out.println(reverseString("abcd"));
    }

    public static String reverseString (String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }
}
