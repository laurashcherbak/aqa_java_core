package aqa.core.lesson5.HalynaKuchabska;


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
        int unique_count = 0;
        int[] tmp_array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (tmp_array.length == 0) {
                tmp_array[unique_count] = arr[i];
                unique_count++;
            } else {
                boolean element_found = false;
                for (int j = 0; j < tmp_array.length; j++) {
                    if (tmp_array[j] == arr[i]) {
                        element_found = true;
                        break;
                    }
                }
                if (element_found == false) {
                    tmp_array[unique_count] = arr[i];
                    unique_count++;
                }
            }
        }
        int[] result_arr = new int[unique_count];
        for (int i = 0; i < unique_count; i++) {
            result_arr[i] = tmp_array[i];
        }
        return result_arr;
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
        //check is input array is unique
        int[] unique_arr1 = this.uniqueElements(arr1);
        int[] unique_arr2 = this.uniqueElements(arr2);

        int total_array_length = unique_arr1.length + unique_arr2.length;
        int total_array[] = new int[total_array_length];
        int index = 0;
        for (int x : unique_arr1) {
            total_array[index] = x; index++;
        }
        for (int x : unique_arr2) {
            total_array[index] = x; index++;
        }

        //Remove duplicates
        int result[] = new int[total_array.length];
        int record_count = 0;
        for (int i : total_array) {
            if(getRecordCount(total_array, i) < 2)
                result[record_count++] = i;
        }
        // generate array with required size
        int[] result_arr = new int[record_count];
        for (int i = 0; i < record_count; i++) {
            result_arr[i] = result[i];
        }

        // return not sorted array
        return result_arr;
    }

    private int getRecordCount(int[] array, int value){
        int count = 0;
        for (int i : array) {
            if(i==value)
                count++;
        }
        return count;
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
        //check is input array is unique
        int[] unique_arr1 = this.uniqueElements(arr1);
        int[] unique_arr2 = this.uniqueElements(arr2);

        int total_array_length = unique_arr1.length + unique_arr2.length;
        int total_array[] = new int[total_array_length];
        int index = 0;
        for (int x : unique_arr1) {
            total_array[index] = x; index++;
        }
        for (int x : unique_arr2) {
            total_array[index] = x; index++;
        }

        //Save consist array
        int result_tmp[] = new int[total_array.length];
        int record_count_tmp = 0;
        for (int i : total_array) {
            if(getRecordCount(total_array, i) > 1)
                result_tmp[record_count_tmp++] = i;
        }

        int[] result_arr_tmp = new int[record_count_tmp];
        for (int i = 0; i < record_count_tmp; i++) {
            result_arr_tmp[i] = result_tmp[i];
        }

        //Remove duplicates
        int result[] = new int[result_arr_tmp.length];
        int record_count = 0;
        for (int i : result_arr_tmp) {
            if(getRecordCount(result, i) == 0)
                result[record_count++] = i;
        }

        // generate array with required size
        int[] result_arr = new int[record_count];
        for (int i = 0; i < record_count; i++) {
            result_arr[i] = result[i];
        }

        // return not sorted array
        return result_arr;
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
        int[] reversed_array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed_array[i] = arr[arr.length - 1 - i];
        }
        return reversed_array;
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
        int n = arr.length;
        for (int i = 0; i < n-1; i = i + 2)
            for (int j = 0; j < n-i-2; j = j + 2)
                if (arr[j] > arr[j+2]) {
                    int temp = arr[j];
                    arr[j] = arr[j+2];
                    arr[j+2] = temp;
                }
        return arr;
    }
}
