package main.java.aqa.core.lesson9.virakrychkovska;
public class Part2 {
        public static void main(String [] args) {
            String Str1 = "Cartoon";
            String Str2 = "Tomcat";

            StringBuilder dif =new StringBuilder();
            for(int i=0; i<Str1.length();i++ ) {
                char item = Str1.charAt(i);
                if (Str2.indexOf(item) == -1) {
                    dif.append(item);
                }
            }
            System.out.println(dif);
        }
}
