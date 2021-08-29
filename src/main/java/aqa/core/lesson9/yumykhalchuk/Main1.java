package main.java.aqa.core.lesson9.yumykhalchuk;
/*
1.	Create a class Main with a main() method.
2.	In method main() declare local variable myStr of String type and assign a value:
    “My best education project in GlobalLogic”.
3.	Using the methods of the class String, do next steps:
a.	Find the index of first “a” substring of myStr value and print result to console.
b.	Find the index of last “b” substring of myStr value and print result to console.
c.	Get substring of myStr from 3 to 6 char index and print result to console.
4.	Create static method reverseString(String) which return String value as result
    with changed order of letters (reverse it, for example “abcd” ->”dcba”).
5.	Invoke reverseString() method with myStr argument and print result to console.
 */

public class Main1 {
    public static void main(String[] args) {
        String myStr = "My best education project in GlobalLogic";
        int indexA, indexB;
        indexA = myStr.indexOf("a");
        indexB = myStr.lastIndexOf("b");
        System.out.println("The index of first 'a' : " + " " + indexA);
        System.out.println("The index of last 'b' : " + " " + indexB);
        System.out.println(myStr.substring(3, 6));
        String myStr2 = "My life, my rules";
        reverseString(myStr2);
    }
    public static String reverseString(String str){
        for (int i = str.length()-1; i >= 0; i--){
            char strToChar = str.charAt(i);
            System.out.print(strToChar);
        }
        return str;
    }





}
