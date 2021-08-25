package aqa.core.lesson5.RomanovYevgen;

public class HomeWork5 {
    /**
     * Implement the method that returns array of unique elements of input array (filter duplicate elements)
     * <p>
     * Examples:* input array - [1, 2, 5, 2, 4]
     * output array - [1, 2, 5, 4]
     * <p>
     * input array - [2, 3, 2, 3]
     * output array - [2, 3]
     * @return - array with elements that don't have duplicates
     */

    public static int[] uniqueElements(int[] arr) {
        boolean[] duplicateMap = new boolean[arr.length];
        int duplicate = 0;
        int index=0;
        int[]result;

        for (int x = 0; x < arr.length; x++) {
            for (int j = 0; j < arr.length; j++) {
                if (x == j) {
                    break;
                }
                if (arr[x] == arr[j]) {
                    duplicateMap[x] = true;
                    duplicateMap[j]=false;
                    duplicate++;
                }
            }
        }
        result=new int[arr.length-duplicate];
        for(int k=0; k< arr.length;k++){
            if(!duplicateMap[k]){
                result[index]=arr[k];
                index++;
            }
        }

        return result;
    }


    /*-*/


    public int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
        arr1 = (arr1);
        arr2 = (arr2);

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
        arr1 =  (arr1);
        arr2 =  (arr2);

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
            } else if (arr1[i1] < arr2[i2]) {
                i1++;
            } else if (arr1[i1] > arr2[i2]) {
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
     //     * Implement the method that sorts elements of an array that place on even positions  (indexes: 0, 2, 4 ...)
     //     * <p>
     //     * Example:
     //     * input array - [3, 7, 1, 4, 2]
     //     * output array - [1, 7, 2, 4, 3]
     //     *
     //     * @param arr - input array
     //     * @return - sorted array of elements on even positions
     //     */


    public  int[] sortEvenPositionArray(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            for (int a = 0; a < arr.length - 1 - i; a += 2) {
                if (arr[a] > arr[a + 2]) {
                    int temp = arr[a];
                    arr[a] = arr[a + 2];
                    arr[+2] = temp;
                }
            }
        }
        return arr;

    }
        /*-*/
    public static int[] merge(int[] arr1, int[] arr2) {
            int[] result = new int[arr1.length + arr2.length];
            int i = 0, j = 0, r = 0;
            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    result[r] = arr1[i];
                    i++;
                } else {
                    result[r] = arr2[j];
                    j++;
                }
                r++;
            }if (i < arr1.length){
                System.arraycopy(arr2, j, result, r, (arr1.length - i));
            }
            if (j < arr2.length){
                System.arraycopy(arr2, j, result, r, (arr1.length - j));
            }
            return  result;
            }
}