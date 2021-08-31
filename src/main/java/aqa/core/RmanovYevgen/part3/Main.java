package aqa.core.RmanovYevgen.part3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uniqueChars("use for String")));
    }

    public static char[] uniqueChars(String input) {
        char[] inputCharArray = input.toCharArray();
        int counter = 0;
        for (int i = 0; i < inputCharArray.length; i++) {
            boolean some = true;
            for (int q = 0; q < inputCharArray.length; q++) {
                if (i == q) continue;
                if (inputCharArray[i] == inputCharArray[q]) {
                    some = false;
                    break;
                }
            }
            if (some) counter++;
        }

        char[] output = new char[counter];
        for (int i = 0, q = 0; i < inputCharArray.length; i++) {
            boolean some = true;
            for (q = 0; q < inputCharArray.length; q++) {
                if (i == q) continue;
                if (inputCharArray[i] == inputCharArray[q]) {
                    some = false;
                    break;
                }
            }
            if (some) {
                output[q] = inputCharArray[i];
                q++;

            }
        }
        return output;
    }
}
