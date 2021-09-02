package aqa.core.lesson9.MykhailoOsadtsiv.Kata;

import java.util.Arrays;

public class ArrayDiff {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2, 4})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here
        int count = 0;
        Arrays.sort(b);
        boolean add = true;
        for (int i = 0; i < a.length; i++) {
            add = true;
            if (Arrays.binarySearch(b, a[i]) >= 0) add = false;
           // System.out.println(Arrays.binarySearch(b, a[i]));
            if (add) count++;
        }
        int[] result = new int[count];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            add = true;
            if (Arrays.binarySearch(b, a[i]) >= 0) add = false;
            if (add) {
                result[k] = a[i];
                k++;
            }
        }
        return result;
    }
}
