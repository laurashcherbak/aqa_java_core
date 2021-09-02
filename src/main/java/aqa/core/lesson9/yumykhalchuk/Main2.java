package aqa.core.lesson9.yumykhalchuk;

/*
1.	Create a class Main with a main() method.
2.	In method main() declare two local variables myStr1 and myStr2 of String type and assign
    a value “Cartoon” for first string and ”Tomcat” for second.
3.	Write code to display all of the letters, which are present in the first word, but absent
    in the second.
 */

public class Main2 {
    public static void main(String[] args) {

        StringBuffer str1 = new StringBuffer("Cartoon"); //Crn
        StringBuffer str2 = new StringBuffer("Tomcat");
        for(int i = 0; i < str1.length(); i++){
            for (int j = 0; j < str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    str1.deleteCharAt(i);
                    i--;
                    j--;
                }
            }
        }
        System.out.println(str1);
    }
}
