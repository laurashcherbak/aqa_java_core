package aqa.core.lesson5.YliiaGnatuik;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MethodsTaskHomework5 {

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
        return Arrays.stream(arr).distinct().toArray();
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
        int[] array = joinArray(arr1, arr2);
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        return Arrays.stream(array).filter(s -> Collections.frequency(list, s) == 1).toArray();
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
        int[] array = joinArray(arr1, arr2);
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        return Arrays.stream(array).filter(s -> Collections.frequency(list, s) > 1).toArray();
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
        return IntStream.range(0, arr.length)
                .map(i -> arr[arr.length - 1 - i])
                .toArray();
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
        return sortEven(arr);
    }

    public static void main(String[] args) {
        MethodsTaskHomework5 a = new MethodsTaskHomework5();

        int[] array1 = new int[] {5,6,3,8,5,1,9,8,5,3};
        System.out.println("Task1 input " + Arrays.toString(array1));
        System.out.println("Task1 output " + Arrays.toString(a.uniqueElements(array1)));

        int[] array2 = new int[] {1,2,4,5};
        int[] array3 = new int[] {1,3,7,5};
        System.out.println("Task2 input array1 " + Arrays.toString(array2) + " array2 " + Arrays.toString(array3));
        System.out.println("Task2 output " + Arrays.toString(a.uniqueElementsMergeArray(array2, array3)));

        int[] array4 = new int[] {1,2,4,5};
        int[] array5 = new int[] {1,3,7,5};
        System.out.println("Task3 input array1 " + Arrays.toString(array4) + " array2 " + Arrays.toString(array5));
        System.out.println("Task3 output " + Arrays.toString(a.commonElements(array4, array5)));

        int[] array6 = new int[] {5,6,3,8,5,1,9,8,5,3};
        System.out.println("Task4 input " + Arrays.toString(array6));
        System.out.println("Task4 output " + Arrays.toString(a.reverseArray(array6)));

        int[] array7 = new int[] {3,7,1,4,2};
        System.out.println("Task5 input " + Arrays.toString(array7));
        System.out.println("Task5 output " + Arrays.toString(a.sortEvenPositionArray(array7)));



    }

    static int[] joinArray(int[]... arrays) {
        int length = 0;
        for (int[] array : arrays) {
            length += array.length;
        }

        final int[] result = new int[length];

        int offset = 0;
        for (int[] array : arrays) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }

        return result;
    }

    public int[] sortEven(int[] inputArray) {
        List list = new ArrayList();
        for (int i = 0; i < inputArray.length; i++) {
            if (i%2 == 0)
                list.add(inputArray[i]);
        }
        Collections.sort(list);
        int j=0;
        for (int i = 0; i < inputArray.length; i++) {
            if (i%2== 0){
                inputArray[i] = Integer.parseInt(list.get(j).toString());
                j++;}
        }

        return inputArray;
    }
}
