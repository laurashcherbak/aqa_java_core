package aqa.core.lesson9.avrakhovalesson9;

   public class Main {
    public static void main(String[] args) {
        String myStr= "My best education project in GlobalLogic";

        int i1 = myStr.indexOf('a');
        int i3 = myStr.lastIndexOf('b');
        String substring1 = myStr.substring(3,6);

        System.out.println(i1);
        System.out.println(i3);
        System.out.println(substring1);

        String g = "abcd";
        reverseString(g);
        System.out.println(reverseString(g));

 }
       public static String reverseString( String inputString ) {
           int stringLength = inputString.length();
           String result = "";
           for (int i=0; i< stringLength; i++) {
               result = inputString.charAt(i) + result;
           }
           return result;

       }
}
