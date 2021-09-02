package aqa.core.lesson9.yesyp;


import java.util.ArrayList;
import java.util.List;

public class MainCat {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        char[] arrA = myStr1.toCharArray();
        char [] arrB = myStr2.toCharArray();
        boolean c = false;
        List<Character> list = new ArrayList<>();
        for (char value : arrA) {
            for (char item : arrB) {
                if (value == item) {
                    c = true;
                    break;
                }
            }
            if (!c) {
                list.add(value);
            } else {
                c = false;
            }
        }
        System.out.println("This letters are absent in the second word: "+list);
    }
}
