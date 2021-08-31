package aqa.core.lesson9.VdovychNazar;

public class Main {
    public static void main(String[] args) {
        String myStr = "My best education project in GlobalLogic";
        System.out.println(myStr.indexOf('a'));
        System.out.println(myStr.lastIndexOf('b'));
        System.out.println(myStr.substring(3, 6));
        myStr = reverseString(myStr);
        System.out.println(myStr);
        System.out.println(reverseString("Nazarvdovych"));

    }

    public static String reverseString(String Str) {
        char[] array = Str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;


    }
}
