package aqa.core.lesson9.elenabeymart9;
//Create a class Main with a main() method
// 2.In method main() declare local variable myStr of String type and assign a value: “My best education project in GlobalLogic”
// 3.Using the methods of the class String, do next steps:
// a Find the index of first “a” substring of myStr value and print result to console.
// b Find the index of last “b” substring of myStr value and print result to console.
// c Get substring of myStr from 3 to 6 char index and print result to console.
// 4.Create static method reverseString(String) which return String value as result with changed order of letters (reverse it, for example “abcd” ->”dcba”).
// 5.Invoke reverseString() method with myStr argument and print result to console

public class Main {
    public static void main(String[] args) {
String myStr = "My best education project in GlobalLogic";
int index1 = myStr.indexOf("a");
int index2 = myStr.lastIndexOf("b");
String substring = myStr.substring(3, 6);
System.out.println(myStr.indexOf("a"));
System.out.println(myStr.lastIndexOf("b"));
System.out.println(myStr.substring(3, 6 ));
System.out.println(reverseString("My best education project in GlobalLogic"));
System.out.println(reverseString(myStr));
    }
    private static String reverseString(String myStr1) {
        for (int i = myStr1.length() -1; i >= 0; i --) {
            char myStr1ToChar = myStr1.charAt(i);
            System.out.println(myStr1ToChar);
        }
        return myStr1;
    }
}
