package aqa.core.lesson9.avrakhovalesson9;

import java.util.Locale;

public class Main1 {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        firstNotSecond (myStr1,myStr2);

    }

    public static void firstNotSecond (String first, String second) {
        String str1 = first.toLowerCase(Locale.ROOT);
        String str2 = second.toLowerCase(Locale.ROOT);
        for (int i = str1.length() - 1; i >= 0; i--) {
            if (str2.indexOf(str1.charAt(i)) == -1) {
                System.out.println(str1.charAt(i));
            }
        }
    }
}
