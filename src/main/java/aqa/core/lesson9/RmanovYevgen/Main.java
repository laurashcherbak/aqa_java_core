package aqa.core.lesson9.RmanovYevgen;

public class Main {
    public static void main(String[] args) {
        String myStr = "Romanov";
        System.out.println(myStr.indexOf("a"));
        System.out.println(myStr.lastIndexOf("b"));
        System.out.println(myStr.substring(1, 2));
        System.out.println(reverseString("Romanov"));
        System.out.println("Yevgen");
    }

    public static String reverseString (String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        final String output1 = output;
        return output1;
    }
}
