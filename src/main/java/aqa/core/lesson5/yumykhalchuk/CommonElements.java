package main.java.aqa.core.lesson5.yumykhalchuk;

import java.util.Arrays;
/*
 * Implement the method that merges two arrays into one. The resulting array should consist of elements that present in both arrays
 * Example:
 * arr1 - [1, 2, 3] arr2 - [2, 3, 4]
 * output array - [2, 3]
 * @param arr1 - first input array with unique elements
 * @param arr2 - second input array with unique elements
 * @return array with common elements from first and second arrays
 */

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 8, 0};
        int[] arr2 = {2, 3, 4, 9 ,5, 0};
        System.out.println(Arrays.toString(commonElements(arr1, arr2)));
    }
    public static int[] commonElements(int[] arr1, int[] arr2) {

        int[]arr3 = new int[arr1.length];
        int index = 0;
        for (int k : arr1) {
            for (int i : arr2) {
                if (k == i) {
                    arr3[index] = k;
                    index++;
                    break;
                }
            }
        }
        //int[]arr4 = new int[index];
        arr3 = Arrays.copyOf(arr3, index);
        //System.out.println(index);
        return arr3;
    }
}

