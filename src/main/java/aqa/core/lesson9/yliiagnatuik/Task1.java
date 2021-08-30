package aqa.core.lesson9.yliiagnatuik;

public class Task1 {
    public static void main(String[] args) {
        String myStr = "My best education project in GlobalLogic";

        System.out.println(myStr.indexOf('a'));
        System.out.println(myStr.lastIndexOf('b'));
        System.out.println(myStr.substring(3, 6));
        System.out.println(reverseString(myStr));
    }

    public static String reverseString(String s) {
        byte[] strAsByteArray = s.getBytes();

        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        return new String(result);
    }
}
