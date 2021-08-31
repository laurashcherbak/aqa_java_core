package elenabeymart9;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(uniqueChars("method using for String")));
    }

    private static char[] uniqueChars(String myStr1) {
        char[] myStr1CharArray = myStr1.toCharArray();
        int counter = 0;
        for (int i = 0; i < myStr1CharArray.length; i++) {
            boolean some = true;
            for (int e = 0; e < myStr1CharArray.length; e++) {
                if (i == e) continue;
                if (myStr1CharArray[i] == myStr1CharArray[e]) {
                    break;
                }
            }
            if (some) {
                counter++;
            }
        }
        char[] myStr2 = new char[counter];
        int i = 0;
        int e;
            boolean some = true;
            for (e = 0; e < myStr1CharArray.length; e++) {
                if (i == e) continue;
                if (myStr1CharArray[i] == myStr1CharArray[e]) {
                    some = false;
                    break;
                }
                if (some) {

                    myStr2[e] = myStr1CharArray[i];
                    e++;
                }
            }
            return myStr2;
        }
    }





