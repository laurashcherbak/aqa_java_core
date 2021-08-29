package aqa.core.lesson9.MykhailoOsadtsiv.Kata;

import java.util.Scanner;

//Given a string of words, you need to find the highest scoring word.
//
//Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//
//You need to return the highest scoring word as a string.
//
//If two words score the same, return the word that appears earliest in the original string.
//
//All letters will be lowercase and all inputs will be valid.
//
//FUNDAMENTALSSTRINGSARRAYSNUMBERS
public class HighestScoringWord {
    public static void main(String[] args) {
        String s = "man i need a taxi up to ubud";
        System.out.println(high(s));
        String s1 = "what time are we climbing up to the volcano";
        System.out.println(high(s1));
    }

    public static String high(String s) {
        // Your code here...
        String temp = s;
        int arrLength = temp.length() - temp.replaceAll(" ", "").length() + 1;
      //  System.out.println(arrLength);
        Scanner sc = new Scanner(s).useDelimiter("\\s* \\s*");
        String[] input = new String[arrLength];
        for (int i = 0; i < arrLength; i++) {
            input[i] = sc.next();
        }
        sc.close();
        int[] wordsScore = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            int score = 0;
            for (int j = 0; j < input[i].length(); j++) {
                score += ((int) input[i].charAt(j)) - 96;
            }
            wordsScore[i] = score;
        }
        int maxindex = 0;
        int maxScore = 0;
        for (int i = 0; i < arrLength; i++) {
            if (maxScore < wordsScore[i]) {
                maxScore = wordsScore[i];
                maxindex = i;
            }
        }
        return input[maxindex];
    }
}
