package aqa.core.lesson9.heleshko;
import java.util.HashMap;

public class Homework9 {
    public static void main(String[] args) {
        String myStr = "My best education project in GlobalLogic";
        System.out.println("myStr = " + myStr);
        String ch = "a";
        String ch2 = "b";
        int posOFa = myStr.indexOf(ch);
        int posOFb = myStr.indexOf(ch2);
        System.out.println(posOFa);
        System.out.println(posOFb);
        System.out.println("Substring of myStr from 3 to 6 char index = " + myStr.substring(3, 6));

        String s = "abcd";
        String result = new StringBuffer(s).reverse().toString();
        System.out.println("ReverseString: " + result);

    }
}

