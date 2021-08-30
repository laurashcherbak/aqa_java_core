package aqa.core.lesson9.yesyp;

public class Char {
    public static void uniqueChars (String s){
        String stringas = "";
        for (int i = 0; i < s.length(); i++) {
            if (stringas.indexOf(s.charAt(i)) == -1) {
                stringas = stringas + s.charAt(i);
            }
        }
        System.out.println( "Unique chars for string: " + stringas+ " ");
    }
}
