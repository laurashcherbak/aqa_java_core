package aqa.core.lesson9.mbednarchuk;

public class Main {
    public static void main(String[] args) {
        String myStr= "My best education project in GlobalLogic";
        int index  = myStr.indexOf("a");
        int index2 = myStr.lastIndexOf("b");
        String substring = myStr.substring(3,6);
        System.out.println(index);
        System.out.println(index2);
        System.out.println(substring);
        System.out.println(reverseString("Bednarchuk"));
        System.out.println(reverseString(myStr));
    }
    public static String reverseString (String revString){
        String turn = "";
        for (int i = revString.length() - 1; i >= 0; i--) {
            turn += revString.charAt(i);
        }
        return turn;
    }

}
