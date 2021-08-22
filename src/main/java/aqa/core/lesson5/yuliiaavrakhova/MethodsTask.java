package aqa.core.lesson5.yuliiaavrakhova;
import java.lang.Math;


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
        int[] result = new int[arr.length];
        int resultIndex = 0;
        int unqiueCount = 0;
        for(int i =0; i<arr.length; i++){
            int elem = arr[i];
            boolean isInResult = false;
            for (int j = 0; j < result.length; j++) {
                if (elem == result[j]) {
                    isInResult = true;
                    break;
                }
            }
            if (!isInResult){
                unqiueCount++;
                result[resultIndex++] = elem;
            }
        }
        int[] finalResult = new int[unqiueCount];
        for (int i =0; i < unqiueCount;i++){
            finalResult[i] = result[i];
        }
        return finalResult;
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
        int[] result = new int[arr1.length + arr2.length];
        int resultIndex = 0;
        int unqiueCount = 0;
        for(int i = 0; i<result.length; i++){
            int elem;
            if(i > arr1.length-1){
                elem = arr2[i-arr1.length];
            }else {
                elem = arr1[i];
            }
            boolean isInFirst = false;
            boolean isInSecond = false;
            for (int j = 0; j < arr1.length; j++) {
                if (elem == arr1[j]) {
                    isInFirst = true;
                    break;
                }
            }
            for (int j = 0; j < arr2.length; j++) {
                if (elem == arr2[j]) {
                    isInSecond = true;
                    break;
                }
            }
            if ((isInFirst && !isInSecond) || (isInSecond && !isInFirst)){
                unqiueCount++;
                result[resultIndex++] = elem;
            }
        }
        int[] finalResult = new int[unqiueCount];
        for (int i =0; i < unqiueCount;i++){
            finalResult[i] = result[i];
        }
        return finalResult;
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
        int[] result = new int[arr1.length + arr2.length];
        int resultIndex = 0;
        int unqiueCount = 0;
        for(int i = 0; i<result.length; i++){
            int elem;
            if(i > arr1.length-1){
                elem = arr2[i-arr1.length];
            }else {
                elem = arr1[i];
            }
            boolean isInFirst = false;
            boolean isInSecond = false;
            boolean isInResult = false;
            for (int j = 0; j < arr1.length; j++) {
                if (elem == arr1[j]) {
                    isInFirst = true;
                    break;
                }
            }
            for (int j = 0; j < arr2.length; j++) {
                if (elem == arr2[j]) {
                    isInSecond = true;
                    break;
                }
            }
            for (int j = 0; j < result.length; j++) {
                if (elem == result[j]) {
                    isInResult = true;
                    break;
                }
            }
            if (isInFirst && isInSecond && !isInResult){
                unqiueCount++;
                result[resultIndex++] = elem;
            }
        }
        int[] finalResult = new int[unqiueCount];
        for (int i =0; i < unqiueCount;i++){
            finalResult[i] = result[i];
        }
        return finalResult;
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
        int[] arr2 = new int[arr.length];
        int a = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[a] = arr[i];
            a += 1;
        }
        return arr2;
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
        int count = arr.length;
        int[] evens = new int[(int)Math.ceil((double)count/2)];
        for(int i =0; i < count; i=i+2){
            evens[i/2] = arr[i];
        }
        for(int i=0; i<evens.length;i++){
            for(int j = i+1; j<evens.length;j++){
                if(evens[i]>evens[j]){
                    int tmp = evens[i];
                    evens[i] = evens[j];
                    evens[j]=tmp;
                }
            }
        }
        for(int i =0; i<count; i=i+2){
            arr[i] = evens[i/2];
        }
        return arr;
    }
}
