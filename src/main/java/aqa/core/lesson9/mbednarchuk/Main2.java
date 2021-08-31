package aqa.core.lesson9.mbednarchuk;

import java.util.Locale;

public class Main2 {
    public static void main(String[] args) {
        String myStr1= "Cartoon";
        String myStr2= "Tomcat";
        System.out.println("Unique letter:");
        rareSt (myStr1,myStr2);

    }
    public static void rareSt (String f, String s) {
        String str1 = f.toLowerCase(Locale.ROOT);
        String str2 = s.toLowerCase(Locale.ROOT);
        for (int i = str1.length() - 1; i >= 0; i--) {
            if (str2.indexOf(str1.charAt(i)) == -1) {
                System.out.println(str1.charAt(i));
            }
        }
    }
}
