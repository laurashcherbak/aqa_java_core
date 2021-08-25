package aqa.core.lesson5.heleshko;


import java.util.*;
import java.util.stream.IntStream;

public class MethodsTask {

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
        ArrayList<Integer> filteredArr = new ArrayList<Integer>();

        for (int toCheckValue : arr) {
            boolean doesExist = filteredArr.contains(toCheckValue);
            if (!doesExist) {
                filteredArr.add(toCheckValue);
            }
        }

        return filteredArr.stream().mapToInt(i -> i).toArray();
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
        ArrayList<Integer> filteredArr = new ArrayList<Integer>();

        for (int toCheckValue : arr1) {
            boolean doesExist = IntStream.of(arr2).anyMatch(x -> x == toCheckValue);
            if (!doesExist) {
                filteredArr.add(toCheckValue);
            }
        }

        for (int toCheckValue : arr2) {
            boolean doesExist = IntStream.of(arr1).anyMatch(x -> x == toCheckValue);
            if (!doesExist) {
                filteredArr.add(toCheckValue);
            }
        }

        return filteredArr.stream().mapToInt(i -> i).toArray();
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
        ArrayList<Integer> filteredArr = new ArrayList<Integer>();

        for (int toCheckValue : arr1) {
            boolean doesExist = IntStream.of(arr2).anyMatch(x -> x == toCheckValue);
            if (doesExist) {
                filteredArr.add(toCheckValue);
            }
        }

        for (int toCheckValue : arr2) {
            boolean doesExist = IntStream.of(arr1).anyMatch(x -> x == toCheckValue);
            int[] filtered = filteredArr.stream().mapToInt(i -> i).toArray();
            boolean doesExistInFiltered = IntStream.of(filtered).anyMatch(x -> x == toCheckValue);
            if (doesExist && !doesExistInFiltered) {
                filteredArr.add(toCheckValue);
            }
        }

        return filteredArr.stream().mapToInt(i -> i).toArray();
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
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
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
        List<Integer> evens = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) {
            evens.add(arr[i]);
        }
        Collections.sort(evens);
        int j = 0;
        int sortedEvens[] = evens.stream().mapToInt(i->i).toArray();
        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = sortedEvens[j];
            j++;
        }

        return arr;
    }
}
