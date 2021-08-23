package aqa.core.lesson5.LiubovPylypenko;
import java.util.Arrays;

public class HomeTasks5 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 2, 4};
        int[] arr2 = {2, 3, 2, 3};

        System.out.println("task1");
        System.out.println("first array: " + Arrays.toString(arr1));
        System.out.println("result first array: " + Arrays.toString(uniqueElements(arr1)));

        System.out.println("second array: " + Arrays.toString(arr2));
        System.out.println("result second array: " + Arrays.toString(uniqueElements(arr2)));

        System.out.println("task2");
        arr1 = new int[]{1, 2, 4, 5};
        arr2 = new int[]{1, 3, 7, 5};
        System.out.println("first array: " + Arrays.toString(arr1));
        System.out.println("second array: " + Arrays.toString(arr2));
        System.out.println("result array: " + Arrays.toString(uniqueElementsMergeArray(arr1, arr2)));

        System.out.println("task3");
        arr1 = new int[]{1, 2, 3};
        arr2 = new int[]{2, 3, 4};
        System.out.println("first array: " + Arrays.toString(arr1));
        System.out.println("second array: " + Arrays.toString(arr2));
        System.out.println("result array: " + Arrays.toString(commonElements(arr1, arr2)));

        System.out.println("task4");
        arr1 = new int[]{1, 2, 3, 4};
        System.out.println("input array: " + Arrays.toString(arr1));
        System.out.println("reversed result array: " + Arrays.toString(reverseArray(arr1)));

        System.out.println("task5");
        arr1 = new int[]{3, 7, 1, 4, 2};
        System.out.println("input array: " + Arrays.toString(arr1));
        System.out.println("reversed result array: " + Arrays.toString(sortEvenPositionArray(arr1)));
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
    public static int[] uniqueElements(int[] arr) {
        int[] resArr = new int[0];
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
            if (i == j) {
                int[] tempArr = new int[resArr.length + 1];
                System.arraycopy(resArr, 0, tempArr, 0, resArr.length);
                tempArr[tempArr.length - 1] = arr[i];
                resArr = tempArr;
            }
        }
        return resArr;
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
        int[] tempArr = new int[arr1.length + arr2.length];
        int index = 0;
        int unqiueQuantity = 0;
        for(int i = 0; i<tempArr.length; i++){
            int elem;
            if(i > arr1.length-1){
                elem = arr2[i-arr1.length];
            }else {
                elem = arr1[i];
            }
            boolean isInFirstArray = false;
            boolean isInSecondArray = false;
            for (int j = 0; j < arr1.length; j++) {
                if (elem == arr1[j]) {
                    isInFirstArray = true;
                    break;
                }
            }
            for (int j = 0; j < arr2.length; j++) {
                if (elem == arr2[j]) {
                    isInSecondArray = true;
                    break;
                }
            }
            if ((isInFirstArray && !isInSecondArray) || (isInSecondArray && !isInFirstArray)){
                unqiueQuantity++;
                tempArr[index++] = elem;
            }
        }
        int[] rezArr = new int[unqiueQuantity];
        for (int i =0; i < unqiueQuantity;i++){
            rezArr[i] = tempArr[i];
        }
        return rezArr;
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
    public static int[] commonElements(int[] arr1, int[] arr2) {
        int[] rezArr = new int[0];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    int[] tempArr = new int[rezArr.length + 1];
                    System.arraycopy(rezArr, 0, tempArr, 0, rezArr.length);
                    tempArr[tempArr.length - 1] = arr1[i];
                    rezArr = tempArr;
                }
            }
        }
        return rezArr;
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
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[j] = arr[i];
            j++;
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
    public static int[] sortEvenPositionArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length - 1 - i; j ++) {
                    if ((j % 2 == 0) && (arr[j] > arr[j + 2])) {
                            //swap elements
                            int tempElement = arr[j];
                            arr[j] = arr[j + 2];
                            arr[j + 2] = tempElement;
                    }
                }
            }
        }
        return arr;
    }
}
