package main.java.aqa.core.lesson5.yumykhalchuk;

import java.util.Arrays;

/*
 * Implement the method that sorts elements of an array that place on even positions  (indexes: 0, 2, 4 ...)
 * Example:
 * input array - [3, 7, 1, 4, 2]
 * output array - [1, 7, 2, 4, 3]
 * @param arr - input array
 * @return - sorted array of elements on even positions
 */

public class SortEvenPositionArray {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 4, 2};
        System.out.println(Arrays.toString(sortEvenPositionArray(arr)));

    }
    public static int[] sortEvenPositionArray(int[] arr) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < arr.length - 1; i = i + 2) {
                int tmp = arr[i];
                if (arr[i] > arr[i+2]) {
                    arr[i] = arr[i+2];
                    arr[i+2] = tmp;
                    needIteration = true;
                }
            }
        }
        return arr;
    }
}
