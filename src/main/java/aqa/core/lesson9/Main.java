package aqa.core.lesson9;

import java.nio.charset.StandardCharsets;
import java.sql.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("______________START--------------->\n");
        System.out.println("----------#task 1.1 & 1.2 & 1.3 --");
        System.out.println("↓ Find the index ↓ INPUT data >>> My best education project in Globallogic <<<");
        String myStr1 = "My best education project in Globallogic";
        int i1 = myStr1.indexOf("a");
        int i2 = myStr1.lastIndexOf("b");
        String sub1 = myStr1.substring(3, 6);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(sub1);
        System.out.println(reverseString("abcd"));
        System.out.println(presentAbsent("Cartoon", "Tomcat"));
        System.out.println(uniqueChars("Using methods of class String” as argument"));
        System.out.println(uniqueCharsWithSpaces("Using methods of class String” as argument"));
        System.out.println("\n--------------->END_______________✘\n");
    }

    private static String reverseString(String myStr2) {
        byte[] arr = myStr2.getBytes();
        byte[] res = new byte[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - i - 1];
        }
        System.out.println("----------#task 1.4 & 1.5 -------");
        System.out.println("↓ reverseString ↓ INPUT data >>> abcd <<<");
        return new String(res);
    }

    private static String presentAbsent(String string1, String string2) {
        char[] arr1 = string1.toCharArray();
        char[] arr2 = string2.toCharArray();
        char[] res = arr1;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    res[i] = 0;
                }
            }
        }
        res = delete(res);
        System.out.println("----------#task_2----------------");
        System.out.println("↓ presentAbsent ↓ INPUT data >>> Cartoon and Tomcat <<<");
        return new String(res);
    }

    private static char[] delete(char[] chars) {
        char[] result = new char[0];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 0) {
                char[] temp = result;
                result = new char[result.length + 1];
                System.arraycopy(temp, 0, result, 0, temp.length);
                result[result.length - 1] = chars[i];
            }
        }
        return result;
    }

    private static char[] uniqueChars(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    chars[j] = 0;
                }
            }
        }
        System.out.println("----------#task_3----------------");
        System.out.println("↓ uniqueChars ↓ INPUT data >>> Using methods of class String” as argument <<<");
        return delete(chars);
    }

    private static char[] uniqueCharsWithSpaces(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == ' ') {
                    continue;
                }
                if (chars[i] == chars[j]) {
                    chars[j] = 0;
                }
            }
        }
        System.out.println("\n↓ uniqueCharsWithSpaces ↓ INPUT data >>> Using methods of class String” as argument <<<");
        return delete(chars);
    }

}
