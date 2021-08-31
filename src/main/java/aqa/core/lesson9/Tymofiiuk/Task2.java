package aqa.core.lesson9.Tymofiiuk;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Task 2:");
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";


        char[] try1 = myStr1.toCharArray();
        for (int i = 0; i < try1.length; i++) {
            if (!myStr2.contains(String.valueOf(try1[i]))) {
                System.out.print(try1[i]);
            }
        }
    }
}
