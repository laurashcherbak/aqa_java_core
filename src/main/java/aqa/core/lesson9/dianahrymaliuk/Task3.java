package aqa.core.lesson9.dianahrymaliuk;


import java.util.*;

public class Task3 extends Task2 {
    public static void main(String []args){
        String line = "Using methods of class String";
        char[] myArray = line.toCharArray();
        Arrays.sort(myArray);
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    myArray[i] = line.charAt(i);
                }
            }
    }
}
}

