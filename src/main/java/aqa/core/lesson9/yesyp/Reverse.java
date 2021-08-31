package aqa.core.lesson9.yesyp;

public class Reverse {
    public static String reverseString (String str) {
        StringBuilder b = new StringBuilder(str);
        b.reverse();
        return b.toString();
    }
}
