package aqa.core.lesson5.DianaHrymaliuk;

import java.util.Arrays;

public class HomeWork5 {
    //    /**
//     * Implement the method that returns array of unique elements of input array (filter duplicate elements)
//     * <p>
//     * Examples:
//     * input array - [1, 2, 5, 2, 4]
//     * output array - [1, 2, 5, 4]
//     * <p>
//     * input array - [2, 3, 2, 3]
//     * output array - [2, 3]
//     *
//     * @param  - array with elements
//     * @return - array with elements that don't have duplicates

    public static int[] uniqueElements(int[] arr) {
        if (arr == null || arr.length == 0) return arr;
        Arrays.sort(arr);
        int n = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) n++;
        }
        int[] res = new int[n];
        res[0] = arr[0];
        n = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) res[n++] = arr[i];
        }
        return res;
    }

//     * Implement the method that merges two arrays into one. Resulting array should consist of elements that present only in the one array and absent in other
//     * <p>
//     * Example:
//     * arr1 - [1, 2, 4, 5],  arr2 - [1, 3, 7, 5]
//     * output array - [2, 3, 4, 7]
//     *
//     * @param arr1 - first input array with unique elements
//     * @param arr2 - second input array with unique elements
//     * @return array with not common elements from input arrays
//     */

    public int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        return arr3;
    }

    public static void sortArray(int[] arr1) {
        for (int lastPos = arr1.length - 1; lastPos >= 0; lastPos--) {
            for (int index = 0; index <= lastPos - 1; index++) {
                if (arr1[index] > arr1[index + 1]) {
                    int temp = arr1[index];
                    arr1[index] = arr1[index + 1];
                    arr1[index + 1] = temp;
                }
            }
        }
    }

    public static int countUniqueValues(int[] arr3) {
        int unique = arr3.length;
        for (int i = 0; i < arr3.length; i++) {
            while (i + 1 < arr3.length && arr3[i] == arr3[i + 1]) {
                i++;
                unique--;
            }
        }
        return unique;
    }

    public int[] mergeDedupSort(int[] arr1, int[] arr2) {
        int[] c = uniqueElementsMergeArray(arr1, arr2);
        sortArray(c);
        int unique = countUniqueValues(c);
        int[] result = new int[unique];
        int p = 0;
        for (int i = 0; i < c.length; i++) {
            result[p++] = c[i];
            while (i + 1 < c.length && c[i] == c[i + 1]) {
                i++;
            }
        }
        return result;
    }

////    /**
////     * Implement the method that merges two arrays into one. The resulting array should consist of elements that present in both arrays
////     * <p>
////     * Example:
//     * arr1 - [1, 2, 3] arr2 - [2, 3, 4]
//     * output array - [2, 3]
//     *
//     * @param arr1 - first input array with unique elements
//     * @param arr2 - second input array with unique elements
//     * @return array with common elements from first and second arrays
//     */

    public int[] commonElements(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                arr3[count] = arr1[i];
                count++;
            }
        }
        int[] arr4 = new int[count];
        System.arraycopy(arr3, 0, arr4, 0, count);
        return arr4;
    }

    //
//    /**
//     * Implement the method that reverses input array in the opposite order
//     * <p>
//     * Example:
//     * input array - [1, 2, 3, 4]
//     * output array - [4, 3, 2, 1]
//     *
//     * @param arr - input array
//     * @return array with opposite ordering of elements
//     */

    public int[] reverseArray(int[] arr) {
        int[] arr2 = new int[arr.length];
        int a = 0;
        for (int i = arr.length - 1; i >= 0; i--)
            arr2[a] = arr[i];
        a++;
        return arr2;
    }

    //    /**
//     * Implement the method that sorts elements of an array that place on even positions  (indexes: 0, 2, 4 ...)
//     * <p>
//     * Example:
//     * input array - [3, 7, 1, 4, 2]
//     * output array - [1, 7, 2, 4, 3]
//     *
//     * @param arr - input array
//     * @return - sorted array of elements on even positions
//     */
    public int[] sortEvenPositionArray(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            for (int a = 0; a < arr.length - 1 - i; a += 2) {
                if (arr[a] > arr[a + 2]) {
                    int temp = arr[a];
                    arr[a] = arr[a + 2];
                    arr[a + 2] = temp;
                }
            }
        }
        return arr;
    }
}