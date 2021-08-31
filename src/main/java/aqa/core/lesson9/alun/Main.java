package aqa.core.lesson9.alun;

//1
public class Main {
    public static void main(String[] args) {
//2
        String nameOfMyStr = "Мій найкращий освітній проект у GlobalLogic";
//3a
        int myStrA = nameOfMyStr.indexOf("а");
        System.out.println("Index of first 'a' equal " + myStrA);
//3b
        int myStrB = nameOfMyStr.lastIndexOf("g");
        System.out.println("Index of first 'g' equal " + myStrB);
//3c
        String myStrC = nameOfMyStr.substring(2, 6);
        System.out.println("3-6 chars are: '" + myStrC + "'");
//5
        System.out.println(reverseString(nameOfMyStr));
    }
//4
    public static String reverseString(String nameOfMyStr){
            char nameChar[]=nameOfMyStr.toCharArray();
            String rev="";
            for(int i=nameChar.length-1;i>=0;i--){
                rev+=nameChar[i];
            }
            return rev;
    }
}

