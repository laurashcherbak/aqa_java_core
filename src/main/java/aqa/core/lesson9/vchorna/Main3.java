package aqa.core.lesson9.vchorna;


public class Main3 {

    public static void main(String[] args) {
        System.out.println(uniqueChars("Using methods of class String"));
    }

    public static char[] uniqueChars(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (builder.indexOf(String.valueOf(c)) == -1) {
                builder.append(c);
            }
        }
        return builder.toString().toCharArray();
    }
}
