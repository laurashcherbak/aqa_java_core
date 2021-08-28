package aqa.core.lesson9.dianahrymaliuk;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        String myStr1 = "cartoon";
        String myStr2 = "tomcat";
        System.out.println(task2(myStr1, myStr2));
    }
    public static String task2(String str1, String str2) {
        StringBuilder str3=new StringBuilder();
        for(int i=0; i<str1.length();i++ ) {
            for (int a = 0; a < str2.length(); a++) {
                if (str1.charAt(i) == str2.charAt(a)) {
                    break;
                }
                if (str2.length() - 1 == a) {
                    str3.append(str1.charAt(i));
                }
            }
        }
        return new String(str3);
    }
}