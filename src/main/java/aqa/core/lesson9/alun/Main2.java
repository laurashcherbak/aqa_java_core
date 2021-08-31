package aqa.core.lesson9.alun;

public class Main2 {
    public static void main(String [] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        StringBuilder result=new StringBuilder();
        for(int i=0; i<myStr1.length();i++ ) {
            char item = myStr1.charAt(i);
            if (myStr2.indexOf(item) == -1) {
                result.append(item);
            }
        }
        System.out.println("Unique letters are: "+result);
    }
}
