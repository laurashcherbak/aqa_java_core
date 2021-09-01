package aqa.core.lesson9.alun;
import java.util.Arrays;
public class Main3 {
    public static void main (String [] args) {
        System.out.println("Using methods of class String");
        System.out.println("Unique chars are:");
        System.out.println(Arrays.toString(uniqueChars("Using methods of class String")));
    }
    public static char[] uniqueChars (String s) {
        StringBuilder result = new StringBuilder();
        for (int x= 0; x < s.length(); x++){
            char element = s.charAt(x);
            if (s.indexOf(element) == s.lastIndexOf(element)) {
                result.append(element);
            }
        }
        return result.toString().toCharArray();
    }
}
