package aqa.core.lesson9.irynaKrechetova;

public class Main {
    public static void main(String[] args) {

        String myStr = "My best education project in GlobalLogic";
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";

        int i1 = myStr.indexOf('a');
        int i2 = myStr.lastIndexOf('b');
        String substring1 = myStr.substring(3,6);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(substring1);
        System.out.println(reverseString(myStr));
        System.out.println(uniqueLetters(myStr1, myStr2));

    }
        public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        String result = "";
        for(int i = arr.length - 1; i >= 0; i--) {
            result = result + arr[i];
        }
        return result;
    }


        public static String uniqueLetters(String s1, String s2) {

            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            String result = "";

            for (int i = 0; i < arr1.length; i++) {
                boolean unique = true;
                for (int j = 0; j < arr2.length; j++) {
                    if (arr1[i] == arr2[j]) unique = false;
                }
                if (unique) {
                    result = result + arr1[i];
                }

            }
            return result;

        }

}
