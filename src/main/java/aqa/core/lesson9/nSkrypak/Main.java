package aqa.core.lesson9.nSkrypak;
import java.lang.*;

public class Main {
    public static String myStr;

    public static void main (String[] args) {
        String myStr = "My best education project in GlobalLogic";
        int firstA = myStr.indexOf("a");
        int lastB = myStr.lastIndexOf("b");
        String substring1 = myStr.substring(3, 7);
        System.out.println(firstA);
        System.out.println(lastB);
        System.out.println(substring1);
        System.out.println(reverseString(myStr));
    }
    public static StringBuilder reverseString(String myStr) {
        Main.myStr = myStr;
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(myStr);
        reverseString.reverse();
        return(reverseString);
    }



}
