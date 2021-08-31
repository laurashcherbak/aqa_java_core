package aqa.core.lesson9.ovlasiuk;

public class Main {

    public static void main(String[]arg) {
        String myStr = "My best education project in GlobalLogic";
        int index = myStr.indexOf("a");
        int index2 = myStr.lastIndexOf("b");
        String substring = myStr.substring(3, 6);
        System.out.println(index);
        System.out.println(index2);
        System.out.println(substring);
        System.out.println(reverseString("abcd"));
    }
    public static String reverseString (String in){
        StringBuilder builder = new StringBuilder();
        for(int i=in.length()-1;i>=0;i--){
            builder.append(in.charAt(i));
        }
        return String.valueOf(builder);

    }

}
