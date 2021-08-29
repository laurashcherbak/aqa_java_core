package main.java.aqa.core.lesson9.yumykhalchuk;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

/*
1.	Create a class Main with a main() method.
2.	Create static method: uniqueChars(String s), which must take a String as argument and return an array of
    distinct (unique) chars (char[]) of the given string.
3.	In method main() add code to invoke uniqueChars() method and pass string: “Using methods of class String” as argument.
4.	Print result to console.
*/

public class Main3 {
    public static void main(String[] args) {
        String s = "Using methods of class String"; // Using methodfclaSr
        uniqueChars(s);
    }
    public static String uniqueChars(String s){
        char[]elements = s.toCharArray();
        for(int i = 0; i < elements.length; i++) {
            for(int j = i + 1; j < elements.length; j++){
                if (elements[i] == elements[j]){
                    elements = ArrayUtils.remove(elements, j);
                    i--;
                }
            }
        }
        System.out.println(elements);
        return Arrays.toString(elements);
    }
}
