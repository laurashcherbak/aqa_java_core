package aqa.core.lesson5.yumykhalchuk;

import java.util.Arrays;

/*
 * Implement the method that reverses input array in the opposite order
 * Example:
 * input array - [1, 2, 3, 4]
 * output array - [4, 3, 2, 1]
 * @param arr - input array
 * @return array with opposite ordering of elements
 */

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr2 = {4, 8, 0, 19, -28};
        System.out.println(Arrays.toString(reverseArray(arr2)));

    }
     public static int[] reverseArray (int[] arr){
            for (int i = arr.length-1; i >= 0; i--) {
                System.out.println();
            }
            return arr;
    }
}
