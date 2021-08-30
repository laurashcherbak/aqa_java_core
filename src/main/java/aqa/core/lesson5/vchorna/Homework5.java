package aqa.core.lesson5.vchorna;

import java.util.Arrays;

public class Homework5 {

    static int linearSearch(int[] array, int value) {
        return linearSearch(array, array.length, value);
    }

    static int linearSearch(int[] array, int length, int value) {
        for (int i = 0; i < length; ++i) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    static boolean contains(int[] array, int value) {
        return linearSearch(array, value) != -1;
    }

    static boolean contains(int[] array, int length, int value) {
        return linearSearch(array, length, value) != -1;
    }

    /**
     * Implement the method that returns array of unique elements of input array (filter duplicate elements)
     * <p>
     * Examples:
     * input array - [1, 2, 5, 2, 4]
     * output array - [1, 2, 5, 4]
     * <p>
     * input array - [2, 3, 2, 3]
     * output array - [2, 3]
     *
     * @param arr - array with elements
     * @return - array with elements that don't have duplicates
     */
    static int[] uniqueElements(int[] arr) {
        int[] result = new int[arr.length];
        int length = 0;

        for (int element : arr) {
            if (!contains(result, length, element)) {
                result[length++] = element;
            }
        }

        return Arrays.copyOf(result, length);
    }


    /**
     * Implement the method that merges two arrays into one. Resulting array should consist of elements that present only in the one array and absent in other
     * <p>
     * Example:
     * arr1 - [1, 2, 4, 5],  arr2 - [1, 3, 7, 5]
     * output array - [2, 3, 4, 7]
     *
     * @param arr1 - first input array with unique elements
     * @param arr2 - second input array with unique elements
     * @return array with not common elements from input arrays
     */
    static int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int length = 0;

        for (int element : arr1) {
            if (!contains(arr2, element)) {
                result[length++] = element;
            }
        }

        for (int element : arr2) {
            if (!contains(arr1, element)) {
                result[length++] = element;
            }
        }

        return Arrays.copyOf(result, length);
    }

    /**
     * Implement the method that merges two arrays into one. The resulting array should consist of elements that present in both arrays
     * <p>
     * Example:
     * arr1 - [1, 2, 3] arr2 - [2, 3, 4]
     * output array - [2, 3]
     *
     * @param arr1 - first input array with unique elements
     * @param arr2 - second input array with unique elements
     * @return array with common elements from first and second arrays
     */
    static int[] commonElements(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int length = 0;

        for (int element : arr1) {
            if (contains(arr2, element)) {
                result[length++] = element;
            }
        }

        return Arrays.copyOf(result, length);
    }

    /**
     * Implement the method that reverses input array in the opposite order
     * <p>
     * Example:
     * input array - [1, 2, 3, 4]
     * output array - [4, 3, 2, 1]
     *
     * @param arr - input array
     * @return array with opposite ordering of elements
     */
    static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int[] result = new int[length];

        int last = length - 1;
        for (int i = 0; i < length; ++i) {
            result[i] = arr[last - i];
        }

        return result;
    }

    /**
     * Implement the method that sorts elements of an array that place on even positions  (indexes: 0, 2, 4 ...)
     * <p>
     * Example:
     * input array - [3, 7, 1, 4, 2]
     * output array - [1, 7, 2, 4, 3]
     *
     * @param arr - input array
     * @return - sorted array of elements on even positions
     */
    static int[] sortEvenPositionArray(int[] arr) {
        int[] result = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < result.length - 2; i += 2) {
            for (int j = 0; j < result.length - 2 - i; j += 2) {
                if (result[j] > result[j + 2]) {
                    int temp = result[j];
                    result[j] = result[j + 2];
                    result[j + 2] = temp;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("uniqueElements:");
        int[] arr1 = {1, 2, 5, 2, 4};
        System.out.println("input:");
        System.out.println(Arrays.toString(arr1));
        System.out.println("output:");
        System.out.println(Arrays.toString(uniqueElements(arr1)));
        int[] arr2 = {2, 3, 2, 3};
        System.out.println("input:");
        System.out.println(Arrays.toString(arr2));
        System.out.println("output:");
        System.out.println(Arrays.toString(uniqueElements(arr2)));
        System.out.println();

        System.out.println("uniqueElementsMergeArray:");
        int[] arr3 = {1, 2, 4, 5};
        int[] arr4 = {1, 3, 7, 5};
        System.out.println("input:");
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println("output:");
        System.out.println(Arrays.toString(uniqueElementsMergeArray(arr3, arr4)));
        System.out.println();

        System.out.println("commonElements:");
        int[] arr5 = {1, 2, 3};
        int[] arr6 = {2, 3, 4};
        System.out.println("input:");
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));
        System.out.println("output:");
        System.out.println(Arrays.toString(commonElements(arr5, arr6)));
        System.out.println();

        System.out.println("reverseArray:");
        int[] arr7 = {1, 2, 3, 4};
        System.out.println("input:");
        System.out.println(Arrays.toString(arr7));
        System.out.println("output:");
        System.out.println(Arrays.toString(reverseArray(arr7)));
        System.out.println();

        System.out.println("sortEvenPositionArray:");
        int[] arr8 = {3, 7, 1, 4, 2};
        System.out.println("input:");
        System.out.println(Arrays.toString(arr8));
        System.out.println("output:");
        System.out.println(Arrays.toString(sortEvenPositionArray(arr8)));
    }

}

