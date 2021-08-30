package main.java.aqa.core.lesson9.halynakuchabska;


public class Main {
    public static void main(String[] args) {
        //Task1
        String myStr = "My best education project in GlobalLogic";

        //3a
        System.out.println(myStr.indexOf("a"));
        //3b
        System.out.println(myStr.lastIndexOf("b"));
        //3c
        System.out.println(myStr.substring(3,6));

        //4
        System.out.println(reverseString("abcd"));
        //5
        System.out.println(reverseString(myStr));

        //Task2
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        for (int i = 0; i < myStr1.length(); i++) {
            String tmp = String.valueOf(myStr1.charAt(i));
            if (!myStr2.contains(tmp)) {
                System.out.println(tmp);
            }
        }

        //Task3
        char[] result = uniqueChars("Using methods of class String");
        System.out.println(result);
    }

    public static char[] uniqueChars(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String tmp = String.valueOf(s.charAt(i));
            if (!result.contains(tmp)) {
                result += tmp;
            }
        }
        return result.toCharArray();
    }

    public static String reverseString(String input) {
        StringBuilder builder = new StringBuilder();

        // append a string into StringBuilder builder
        builder.append(input);

        // reverse StringBuilder builder
        builder.reverse();

        return builder.toString();
    }
}
