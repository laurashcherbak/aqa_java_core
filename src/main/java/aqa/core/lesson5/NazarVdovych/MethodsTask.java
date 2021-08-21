package aqa.core.lesson5.NazarVdovych;


public class MethodsTask {

    /*
     * Implement the method that returns array of unique elements of input array (filter duplicate elements)
     * <p>
     * Examples:
     * input array - [1, 2, 5, 2, 4]
     * output array - [1, 2, 5, 4]
     * <p>
     * output array - [2, 3]
     * input array - [2, 3, 2, 3]
     *
     *
     */
    public static void main(String[] args) {
        int[] x = new int[]{1, 1, 1, 2, 2, 2, 1, 3, 1, 2, 5, 4};
        System.out.println(uniqueCount(x));
    }

    public static int uniqueCount(int[] array) {

        int[] copy = new int[array.length];
        int res = 0;
        int countNum = 0;
        int count = 0;

        for (int i = 0; i < copy.length; i++) {
            copy[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            if (copy[i] == 0) {
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        copy[j] = 1;
                        count++;
                    }
                }
            }
            if (countNum < count) {
                countNum = count;
                res++;
            }

        }
        return res;
    }

}
    /*
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
    //public int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
      //  return null;
   // }

    /*
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
   // public int[] commonElements(int[] arr1, int[] arr2) {return null;}

    /*
     * Implement the method that reverses input array in the opposite order
     * <p>
     * Example:
     * input array - [1, 2, 3, 4]
     * output array - [4, 3, 2, 1]
     *
     * @param arr - input array
     * @return array with opposite ordering of elements
     */
    //public int[] reverseArray(int[] arr) {
       // return null;
    //}

    /*
     * Implement the method that sorts elements of an array that place on even positions  (indexes: 0, 2, 4 ...)
     * <p>
     * Example:
     * input array - [3, 7, 1, 4, 2]
     * output array - [1, 7, 2, 4, 3]
     *
     * @param arr - input array
     * @return - sorted array of elements on even positions
     */
    // public int[] sortEvenPositionArray(int[] arr) {
       // return null;
   // }
}
