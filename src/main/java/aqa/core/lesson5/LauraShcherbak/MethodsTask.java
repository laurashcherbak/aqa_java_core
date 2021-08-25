package aqa.core.lesson5.LauraShcherbak;


public class MethodsTask {

    private int[] sort(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        return arr;
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
    public int[] uniqueElements(int[] arr) {
        int size = arr.length;

        int[] temp = new int[size];
        int t = 0;

        // Pick all elements one by one
        for (int i = 0; i < size; i++)
        {
            // Check if the picked element is already got
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            // If not printed earlier, then get it
            if (i == j) {
                temp[t++] = arr[i];
            }
        }

        arr = new int[t];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = temp[j];
        }

        return arr;
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
    public int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
        arr1 = sort(arr1);
        arr2 = sort(arr2);

        int size1 = arr1.length;
        int size2 = arr2.length;

        int[] temp = new int[size1 + size2];

        int i = 0;
        int i1 = 0;
        int i2 = 0;

        while ((i1 < size1) && (i2 < size2)) {
            if (arr1[i1] == arr2[i2]) {
                i1++;
                i2++;
            }
            else if (arr1[i1] < arr2[i2]) {
                temp[i] = arr1[i1];
                i1++;
                i++;
            }
            else if (arr1[i1] > arr2[i2]) {
                temp[i] = arr2[i2];
                i2++;
                i++;
            }
        }

        while ((i1 < size1)) {
            temp[i] = arr1[i1];
            i1++;
            i++;
        }

        while ((i2 < size2)) {
            temp[i] = arr2[i2];
            i2++;
            i++;
        }

        int[] arr = new int[i];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = temp[j];
        }

        return arr;
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
        arr1 = sort(arr1);
        arr2 = sort(arr2);

        int size1 = arr1.length;
        int size2 = arr2.length;

        int[] temp = new int[size1 < size2 ? size1 : size2];

        int i = 0;
        int i1 = 0;
        int i2 = 0;

        while ((i1 < size1) && (i2 < size2)) {
            if (arr1[i1] == arr2[i2]) {
                temp[i] = arr1[i1];
                i1++;
                i2++;
                i++;
            }
            else if (arr1[i1] < arr2[i2]) {
                i1++;
            }
            else if (arr1[i1] > arr2[i2]) {
                i2++;
            }
        }

        int[] arr = new int[i];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = temp[j];
        }

        return arr;
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
        int size = arr.length;

        for(int i = 0; i < size / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = temp;
        }

        return arr;
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
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if ((i % 2 != 1) && (j % 2 != 1) &&
                    (arr[j - 2] > arr[j])) {
                    int temp = arr[j - 2];
                    arr[j - 2] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

//    public static void main(String[] args) {
//
//        int[] arr = new int[]{1, 2, 5, 2, 4};
//        arr = uniqueElements(arr);
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]);
//        }
//        System.out.println("");
//        arr = new int[]{2, 3, 2, 3};
//        arr = uniqueElements(arr);
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]);
//        }
//        System.out.println("");
//
//        int[] arr1 = new int[]{1, 2, 4, 5};
//        int[] arr2 = new int[]{1, 3, 7, 5};
//        arr = uniqueElementsMergeArray(arr1, arr2);
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]);
//        }
//        System.out.println("");
//
//        arr1 = new int[]{1, 2, 3};
//        arr2 = new int[]{2, 3, 4};
//        arr = commonElements(arr1, arr2);
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]);
//        }
//        System.out.println("");
//
//        arr = new int[]{1, 2, 3, 4};
//        arr = reverseArray(arr);
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]);
//        }
//        System.out.println("");
//
//        arr = new int[]{3, 7, 1, 4, 2};
//        arr = sortEvenPositionArray(arr);
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i]);
//        }
//        System.out.println("");
//
//    }

}
