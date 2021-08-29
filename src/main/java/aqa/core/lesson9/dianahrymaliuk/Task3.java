package aqa.core.lesson9.dianahrymaliuk;



public class Task3 {
    public static void main (String [] args) {
        System.out.println(uniqueChars("Using methods of class String"));
    }
    public static char[] uniqueChars (String str) {
        StringBuilder uniq = new StringBuilder();
        for (int i= 0; i < str.length(); i++){
            char element = str.charAt(i);
            if (str.indexOf(element) == str.lastIndexOf(element)) {
                uniq.append(element);
            }
        }
        return uniq.toString().toCharArray();
    }
}


