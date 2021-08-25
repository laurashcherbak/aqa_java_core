package aqa.core.lesson5.yumykhalchuk;

/*
 * Implement the method that merges two arrays into one. Resulting array should consist of elements that present only in the one array and absent in other
 * Example:
 * arr1 - [1, 2, 4, 5],  arr2 - [1, 3, 7, 5]
 * output array - [2, 3, 4, 7]
 * @param arr1 - first input array with unique elements
 * @param arr2 - second input array with unique elements
 * @return array with not common elements from input arrays
 */

import java.util.Arrays;

public class UniqueElementsMergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5};
        int[] arr2 = {1, 3, 7, 5};
        System.out.println(Arrays.toString(uniqueElementsMergeArray(arr1, arr2)));
    }
    public static int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int index = 0;
        for (int k : arr1) {
            boolean unique = true;
            for (int i : arr2) {
                if (k == i) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                arr3[index] = k;
                index++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            boolean unique = true;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr2[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                arr3[index] = arr2[i];
                index++;
            }
        }
        arr3 = Arrays.copyOf(arr3, index);
        return arr3;
    }
}
