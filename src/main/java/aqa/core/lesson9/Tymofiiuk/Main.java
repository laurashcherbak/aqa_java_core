package aqa.core.lesson9;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1:");
        String myStr = "My best education project in GlobalLogic";
        System.out.println("Index of first “a” substring of myStr value:");
        System.out.println(myStr.indexOf("a"));
        System.out.println("Index of last “b” substring of myStr value ");
        System.out.println(myStr.lastIndexOf("b"));
        System.out.println("Substring of myStr from 3 to 6 char index:");
        System.out.println(myStr.substring(3, 6));
        System.out.println("Reverse string:");
        System.out.println(reverseString(myStr));

    }

    public static String reverseString (String in) {
        String out = "";
        for (int k = in.length() - 1; k >= 0; k--) {
            out += in.charAt(k);
        }
        return out;}

}
