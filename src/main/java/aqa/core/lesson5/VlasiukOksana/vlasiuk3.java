package aqa.core.lesson5.VlasiukOksana;

import java.util.ArrayList;
import java.util.Arrays;

public class vlasiuk3 {

//    /**
//     * Implement the method that merges two arrays into one. The resulting array should consist of elements that present in both arrays
//     * <p>
//     * Example:
//     * arr1 - [1, 2, 3] arr2 - [2, 3, 4]
//     * output array - [2, 3]
//     *
//     * @param arr1 - first input array with unique elements
//     * @param arr2 - second input array with unique elements
//     * @return array with common elements from first and second arrays
//     */

    public static void main(String args[]) {
        int[] array1 = {1,2,3};
        int[] array2 = {2,3,4};
        ArrayList<Integer> unique = new ArrayList<>();
        ArrayList<Integer> dup = new ArrayList<>();

        // get the duplicate (common) numbers
        // get the unique numbers of array1 when compared to array2
        for(int i=0; i<array1.length; i++){
            boolean duplicate = false;
            for(int j=0; j<array2.length; j++){
                if(array1[i] == array2[j]){
                    dup.add(array1[i]);
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                unique.add(array1[i]);
            }
        }

        // Add the unique numbers of array2 when compared to array1
        for(int j=0; j<array2.length; j++){
            boolean duplicate = false;
            for(int i=0; i<array1.length; i++){
                if(array1[i] == array2[j]){
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                unique.add(array2[j]);
            }
        }

//        System.out.println("Given two arrays: "+Arrays.toString(array1) + " and "+Arrays.toString(array2));
        System.out.println("Duplicates are: "+dup);
//        System.out.println("Unique elements in the order from 2 arrays: "+unique);
    }
}
