package aqa.core.lesson5.MykhailoOsadtsiv;

import java.util.Arrays;

public class HomeWork5 {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 5, 2, 4};
        System.out.println(Arrays.toString(uniqueElements(arr1)));
        int[] arr2 = new int[]{2, 3, 2, 3};
        System.out.println(Arrays.toString(uniqueElements(arr2)));

        //* arr1 - [1, 2, 4, 5],  arr2 - [1, 3, 7, 5]
        // * output array - [2, 3, 4, 7]
        int[] arr3 = new int[]{1, 2, 4, 5};
        int[] arr4 = new int[]{1, 3, 7, 5};
        System.out.println(Arrays.toString(uniqueElementsMergeArray(arr3, arr4)));

     //   * arr1 - [1, 2, 3] arr2 - [2, 3, 4]
   //  * output array - [2, 3]
        int[] arr5 = new int[]{1, 2, 3};
        int[] arr6 = new int[]{2, 3, 4};
        System.out.println(Arrays.toString(commonElements(arr5, arr6)));

    //     * input array - [1, 2, 3, 4]
   //  * output array - [4, 3, 2, 1]
        int[] arr7 = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(reverseArray(arr7)));

   //     * input array - [3, 7, 1, 4, 2]
   //  * output array - [1, 7, 2, 4, 3]
        int[] arr8 = new int[]{3, 7, 1, 4, 2};
        System.out.println(Arrays.toString(sortEvenPositionArray(arr8)));
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
     //* @param arr - array with elements
    // * @return - array with elements that don't have duplicates
     */
    public static int[] uniqueElements(int[] arr) {
        int[] output = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            boolean addNew = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (x == arr[j]) {
                    addNew = false;
                    break;
                }
            }
            if (addNew) {
                output[k] = x;
                k++;
            }
        }
        int index = 0;
        for (int i = 1; i < output.length; i++) {
            if (output[i] == 0) {
                index = i;
                break;
            }
        }
        if (index!=0) {
            int[] output2 = new int[index];
            System.arraycopy(output, 0, output2,  0, output2.length);
            return output2;
        } else {
            return output;
        }

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
    public static int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int k = 0;
        for (int value : arr1) {
            boolean add = true;
            for (int i : arr2) {
                if (value == i) {
                    add = false;
                    break;
                }
            }
            if (add) {
                arr3[k] = value;
                k++;
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            boolean add = true;
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[i] == arr2[j]) {
                    add = false;
                    break;
                }
            }
            if (add) {
                arr3[k] = arr2[i];
                k++;
            }
        }

        int index = 0;
        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i] == 0) {
                index = i;
                break;
            }
        }
        if (index!=0) {
            int[] output2 = new int[index];
            System.arraycopy(arr3, 0, output2,  0, output2.length);
            return output2;
        } else {
            return arr3;
        }
    }

    /**
     * Implement the method that merges two arrays into one. The resulting array should consist of elements that present in both arrays
     * <p>
     * Example:
     * arr1 - [1, 2, 3] arr2 - [2, 3, 4]
     * output array - [2, 3]
     *
    // * @param arr1 - first input array with unique elements
  //   * @param arr2 - second input array with unique elements
     * @return array with common elements from first and second arrays
     *
     */
    public static int linearSearch(int arr[], int elementToSearch) {

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch)
                return index;
        }
        return -1;
    }

    public static int[] commonElements(int[] arr1, int[] arr2) {
        int outpuyArreyLength = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    outpuyArreyLength++;
                }
            }
        }

        int[] output = new int[outpuyArreyLength];
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && linearSearch(output, arr1[i]) == -1) {
                    output[k] = arr1[i];
                    k++;
                }
            }
        }
        return output;
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
    public static int[] reverseArray(int[] arr) {
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            output[arr.length - i - 1] = arr[i];
        }
        return output;
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
    public static int[] sortEvenPositionArray(int[] arr) {
        int tmp;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length -2; i = i+2) {
                if (arr[i] > arr[i + 2]) {
                tmp = arr[i];
                arr[i] = arr[i + 2];
                arr[i + 2] = tmp;
                isSorted = false;
                }
            }
        }
        return arr;
    }
}
