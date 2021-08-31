package aqa.core.lesson9.vchorna;

public class Main2 {

    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        System.out.println(relativeComplement(myStr1,myStr2));


    }

    public static String relativeComplement(String s1, String s2) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (!s2.contains(String.valueOf(c))) {
                builder.append(c);
            }
        }
        return builder.toString();
    }

}
