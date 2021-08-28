package aqa.core.lesson9.lpylypenko;

public class HomeTasks9 {

    public static void main(String[] args) {
        String myStr = "My best education project in GlobalLogic";
        System.out.println("\nTask1");
        System.out.println("myStr = " + myStr);
        System.out.println("First index of 'a' in myStr = " + myStr.indexOf('a'));
        System.out.println("Last index of 'b' in myStr = " + myStr.lastIndexOf('b'));
        System.out.println("Substring of myStr from 3 to 6 char index = " + myStr.substring(3,6));
        System.out.println("Reverse string for myStr = " + reverseString(myStr));

        System.out.println("\nTask2");
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        System.out.println("myStr1 = " + myStr1);
        System.out.println("myStr2 = " + myStr2);
        StringBuilder strRez = new StringBuilder("");
        for (int i= 0; i < myStr1.length(); i++){
            char letterFromMyStr1 = myStr1.charAt(i);
            if (myStr2.indexOf(letterFromMyStr1) == -1)  strRez.append(letterFromMyStr1);
        }
        System.out.println("Letetrs which are present im myStr1, but absent in myStr2 = " + strRez.toString());

        System.out.println("\nTask2");
        System.out.print("Unique chars from “Using methods of class String” = ");
        System.out.print(uniqueChars("Using methods of class String"));

    }

    public static String reverseString(String str) {
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        return reverseStr;
    }

    public static char[] uniqueChars(String str) {
        StringBuilder strRez = new StringBuilder("");
        for (int i= 0; i < str.length(); i++){
            char letterFromStr = str.charAt(i);
            if (str.indexOf(letterFromStr) == str.lastIndexOf(letterFromStr))  strRez.append(letterFromStr);
        }
        String rezStr = strRez.toString();

        char[] charRez = new char[rezStr.length()];
        for (int i = 0; i < rezStr.length(); i++) {
            charRez[i] = rezStr.charAt(i);
        }

        return charRez;
    }

}
