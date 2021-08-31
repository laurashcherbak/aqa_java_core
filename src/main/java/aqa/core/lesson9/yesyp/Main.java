package aqa.core.lesson9.yesyp;


public class Main {
    public static void main(String[] args) {
        String myStr = "My best education project in GlobalLogic";
        int i1 = myStr.indexOf("a");
        int i2 = myStr.lastIndexOf("b");
        System.out.println("First “a”: " + i1);
        System.out.println("Last “b”: " + i2);
        String subString = myStr.substring(2, 6);
        System.out.println("From 3 to 6 char index:" + subString);
        System.out.println("Reverse string: " + Reverse.reverseString("My best education project in GlobalLogic"));

        Char char1 = new Char();
        String myStr2 = "Using methods of class String";
        System.out.println("String: "+ myStr2);
        char1.uniqueChars (myStr2);
    }
    }



