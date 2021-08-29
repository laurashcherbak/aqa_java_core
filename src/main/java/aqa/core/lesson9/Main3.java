package aqa.core.lesson9;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uniqueChars("Using methods of class String")));
    }
    public static char[] uniqueChars(String s) {
        StringBuilder res = new StringBuilder("");
        for (int i= 0; i < s.length(); i++){
            char pos = s.charAt(i);
            if (s.indexOf(pos) == s.lastIndexOf(pos)) {
                res.append(pos);
            }
        }
        return res.toString().toCharArray();
    }
}
