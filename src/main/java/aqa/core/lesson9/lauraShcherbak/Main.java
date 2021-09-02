package aqa.core.lesson9.lauraShcherbak;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nTask 1: ");

        String myStr = "My best education project in GlobalLogic";
        System.out.println("MyStr : "+myStr);

        System.out.print("Index of first “a” substring of myStr value: ");
        System.out.println(myStr.indexOf('a'));

        System.out.print("Index of last “b” substring of myStr value: ");
        System.out.println(myStr.lastIndexOf('b'));

        System.out.print("Substring of myStr from 3 to 6 char index: ");
        System.out.println(myStr.substring(3,7));

        System.out.println("String value as result with changed order of letters: "+reverseString(myStr));


        System.out.println("\nTask 2: ");

        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        StringBuilder res = new StringBuilder("");
        for (int i = 0; i < myStr1.length(); i++) {
            char t = myStr1.toUpperCase().charAt(i);
            if (myStr2.toUpperCase().indexOf(t) == -1) {
                res.append(t);
            }
        }

        System.out.println("First word (myStr1): "+myStr1);
        System.out.println("Second word (myStr2): "+myStr2);
        System.out.print("All of the letters, which are present in the first word, but absent in the second without case sensitivity: ");
        System.out.println(res);


        System.out.println("\nTask 3: ");

        myStr = "Using methods of class String";

        System.out.println("Given string: "+myStr);
        System.out.print("Array of distinct (unique) chars (char[]) of the given string without case sensitivity: ");
        System.out.println(uniqueChars(myStr.toUpperCase()));

    }

    public static String reverseString(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            res = s.charAt(i) + res;
        }
        return res;
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
