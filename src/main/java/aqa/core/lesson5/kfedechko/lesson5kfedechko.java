package aqa.core.lesson5.kfedechko;


public class lesson5kfedechko {

    public static void main(String[] args) {
        int[] inputUnArr1 = new int[]{1, 2, 5, 2, 4};
        printArray(uniqueElements(inputUnArr1));
        int[] inputUnArr2 = new int[]{2, 3, 2, 3};
        printArray(uniqueElements(inputUnArr2));

        int[] inputMergeUnArr1 = new int[]{1, 2, 4, 5};
        int[] inputMergeUnArr2 = new int[]{1, 3, 7, 5};
        printArray(uniqueElementsMergeArray(inputMergeUnArr1, inputMergeUnArr2));

        int[] inputMergeCommArr1 = new int[]{1, 2, 3};
        int[] inputMergeCommArr2 = new int[]{2, 3, 4};
        printArray(commonElements(inputMergeCommArr1, inputMergeCommArr2));

        int[] inputForRevArr = new int[]{1, 2, 3, 4};
        printArray(reverseArray(inputForRevArr));

        int[] inputSortEvenArr = new int[]{3, 7, 1, 4, 2};
        printArray(sortEvenPositionArray(inputSortEvenArr));

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
    private static int[] uniqueElements(int[] arr) {
        boolean[] isSame = new boolean[arr.length];
        int sameNums = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    isSame[j] = true;
                    sameNums++;
                }
            }
        }

        int[] result = new int[arr.length - sameNums];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!isSame[i]) {
                result[count] = arr[i];
                count++;
            }
        }

        return result;
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
    private static int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
        bubbleSort(arr1);
        bubbleSort(arr2);
        int[] tempArr = new int[arr1.length + arr2.length ];
        int i = 0, j = 0, k = 0, n1 = arr1.length, n2 = arr2.length;
        while (i < n1 && j < n2) {

            // If not common, print smaller
            if (arr1[i] < arr2[j]) {
                tempArr[k] = arr1[i];
                k++;
                i++;
            } else if (arr2[j] < arr1[i]) {
                tempArr[k] = arr2[j];
                k++;
                j++;
            }

            // Skip common element
            else {
                i++;
                j++;
            }
        }

        // printing remaining elements
        while (i < n1) {
            tempArr[k] = arr1[i];
            k++;
            i++;
        }
        while (j < n2) {
            tempArr[k] = arr2[j];
            k++;
            j++;
        }
        int[] commonArr = new int[k];
        System.arraycopy(tempArr, 0, commonArr, 0, k);
        return commonArr;
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
    private static int[] commonElements(int[] arr1, int[] arr2) {
        bubbleSort(arr1);
        bubbleSort(arr2);
        int[] tempArr = new int[arr1.length];
        int i = 0, j = 0, k = 0, n1 = arr1.length, n2 = arr2.length;
        while (i < n1 && j < n2) {

            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                tempArr[k] = arr1[i];
                k++;
                i++;
                j++;
            }
        }
        int[] commonArr = new int[k];
        System.arraycopy(tempArr, 0, commonArr, 0, k);
        return commonArr;
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
    private static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] revertedArray = new int[n];
        int j = n;

        for (int value : arr) {
            revertedArray[j - 1] = value;
            j = j - 1;
        }

        return revertedArray;
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
    private static int[] sortEvenPositionArray(int[] arr) {
        int k = 0, n = arr.length;
        int size = n % 2 == 1 ? n/2 + 1 : n/2;
        int[] evenArr = new int[size];
        for (int i = 0; i < n; i++) {
            if (i % 2 != 1) {
                evenArr[k] = arr[i];
                k++;
            }
        }
        bubbleSort(evenArr);
        k = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 1) {
                arr[i] = evenArr[k];
                k++;
            }
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.print("]\n");
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}

