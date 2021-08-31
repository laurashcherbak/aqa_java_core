package aqa.core.lesson9.MykhailoOsadtsiv.Task2;

public class Main {
    public static void main(String[] args) {
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        firstNotSecond(myStr1, myStr2);
    }

    public static void firstNotSecond (String word1, String word2) {
        for (int i = word1.length() - 1; i >= 0; i--) {  //порядок виводу в завданні не вказаний
            if (word2.indexOf(word1.charAt(i)) == -1) {
                System.out.println(word1.charAt(i));
            }
        }
    }
}
