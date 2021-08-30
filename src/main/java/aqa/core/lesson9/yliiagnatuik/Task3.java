package aqa.core.lesson9.yliiagnatuik;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(uniqueChars("Using methods of class String"));
    }

    public static char[] uniqueChars(String str) {
        List<Character> result = new ArrayList<>();
        int[] count = new int[256];

        int i;
        for (i = 0; i < str.length(); i++)
            if (str.charAt(i) != ' ')
                count[str.charAt(i)]++;
        int n = i;

        for (i = 0; i < n; i++) {
            if (count[str.charAt(i)] == 1) {
                result.add(str.charAt(i));
            }
        }

        return result.stream()
                .map(String::valueOf)
                .collect(Collectors.joining()).toCharArray();

    }
}

