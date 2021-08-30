package elenabeymart9;
//1.Create a class Main with a main() method.
// 2.In method main() declare two local variables myStr1 and myStr2 of String type and assign a value “Cartoon” for first string and ”Tomcat” for second.
// 3.Write code to display all of the letters, which are present in the first word, but absent in the second

public class Main1 {
    public static void main(String[] args) {
        StringBuffer myStr1 = new StringBuffer("Cartoon");
        StringBuffer myStr2 = new StringBuffer("Tomcat");
        for(int i = 0; i < myStr1.length(); i++){
            for (int e = 0; e < myStr2.length(); e++){
                if(myStr1.charAt(i) == myStr2.charAt(e)){
                    myStr1.deleteCharAt(i);
                    i--;
                    e--;
                }
            }
        }
        System.out.println(myStr1);
    }
}

