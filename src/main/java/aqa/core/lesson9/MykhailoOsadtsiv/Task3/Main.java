package aqa.core.lesson9.MykhailoOsadtsiv.Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uniqueChars("Using methods of class String")));
    }

    public static char[] uniqueChars(String input) {
        char[] inputCharArray = input.toCharArray();
        int counter = 0;
        for (int i = 0; i < inputCharArray.length; i++) {
            boolean Uni = true;
            for (int j = 0; j < inputCharArray.length; j++) {
                if (i == j) continue;
                if (inputCharArray[i] == inputCharArray[j]) {
                    Uni = false;
                    break;
                }
            }
            if (Uni) counter++;
        }

        char[] output = new char[counter];
        for (int i = 0, k = 0; i < inputCharArray.length; i++) {
            boolean Uni = true;
            for (int j = 0; j < inputCharArray.length; j++) {
                if (i == j) continue;
                if (inputCharArray[i] == inputCharArray[j]) {
                    Uni = false;
                    break;
                }
            }
            if (Uni) {
                output[k] = inputCharArray[i];
                k++;
            }
        }
        return output;


    }
}
