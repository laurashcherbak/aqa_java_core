package aqa.core.lesson9.MykhailoOsadtsiv;

public class Main {
    public static void main(String[] args) {
        String myStr = "My best education project in GlobalLogic";
        System.out.println(myStr.indexOf("a"));
        System.out.println(myStr.lastIndexOf("b"));
        System.out.println(myStr.substring(3, 6));
        System.out.println(reverseString("abcd"));
        System.out.println("//////////////////////////////////////");

        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        firstNotSecond(myStr1, myStr2);
    }

    public static String reverseString (String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }

    public static void firstNotSecond (String word1, String word2) {
        for (int i = word1.length() - 1; i >= 0; i--) {  //порядок виводу в завданні не вказаний
            if (word2.indexOf(word1.charAt(i)) == -1) {
                System.out.println(word1.charAt(i));
            }
        }
    }
}
