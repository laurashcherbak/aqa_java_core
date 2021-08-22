package aqa.core.lesson5.IrynaKrechetova;

import java.util.Arrays;

public class Homework5 {
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
    public int[] uniqueElements(int[] arr)
    {
        int[] result = new int[arr.length];
        int N = 0;

        for (int i=0; i < arr.length; i++)
        {
          boolean unique = true;
          for (int x=0; x < result.length; x++) {
              if (arr[i] == result[x]) unique = false;
          }
          if (unique == true) {
              result[N] = arr[i];
              N = N + 1;
          }
        }

        int[] trueResult = new int[N];
        System.arraycopy(result, 0, trueResult, 0 , N);


        return trueResult;
    }


    /**
     * Implement the method that merges two arrays into one. Resulting array should consist of elements that present
     * only in the one array and absent in other
     * <p>
     * Example:
     * arr1 - [1, 2, 4, 5],  arr2 - [1, 3, 7, 5]
     * output array - [2, 3, 4, 7]
     *
     * @param arr1 - first input array with unique elements
     * @param arr2 - second input array with unique elements
     * @return array with not common elements from input arrays
     */
    public int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
        int[] result1 = new int[arr1.length + arr2.length];
        int N1 = 0;

        for (int i = 0; i < arr1.length; i++) {
            boolean unique = true;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) unique = false;
            }
            if (unique == true) {
                result1[N1] = arr1[i];
                N1 = N1 + 1;
            }
        }

        for (int j = 0; j < arr2.length; j++) {
            boolean unique = true;
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[j] == arr1[i]) unique = false;
            }
            if (unique == true) {
                result1[N1] = arr2[j];
                N1 = N1 + 1;

            }
        }
        int[] trueResult = new int[N1];
        System.arraycopy(result1, 0, trueResult, 0, N1);

        return trueResult;
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
    public int[] commonElements(int[] arr1, int[] arr2) {

        int[] result = new int[Math.min(arr1.length, arr2.length)];
        int N2 = 0;

        for (int i=0; i < arr1.length; i++)
        {
            boolean unique = true;
            for (int x=0; x < arr2.length; x++) {
                if (arr1[i] == arr2[x]) unique = false;
            }
            if (unique == false) {
                result[N2] = arr1[i];
                N2 = N2 + 1;
            }
        }

        int[] trueResult = new int[N2];
        System.arraycopy(result, 0, trueResult, 0 , N2);

        return trueResult;
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
    public int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        int x = 0;
        for (int i = 0; i < arr.length; i++)
        {
            result[x] = arr[arr.length - i];
            x = x + 1;
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
    public int[] sortEvenPositionArray(int[] arr) {
        int[] result1 = new int[arr.length/2 +1];
        int x = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            result1[x] = arr[i];
            x = x + 1;

        }

        Arrays.sort(result1);
        x = 0;
        for (int i = 0; i < arr.length; i = i +2) {
            arr [i] = result1[x];
            x = x + 1;

        }
        return arr;
    }
}

