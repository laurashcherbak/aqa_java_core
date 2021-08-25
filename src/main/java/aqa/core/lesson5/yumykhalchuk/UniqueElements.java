package aqa.core.lesson5.yumykhalchuk;

//import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;

/*
 * Implement the method that returns array of unique elements of input array (filter duplicate elements)
 * Examples:
 * input array - [1, 2, 5, 2, 4]
 * output array - [1, 2, 5, 4]
 * input array - [2, 3, 2, 3]
 * output array - [2, 3]
 * @return - array with elements that don't have duplicates
 */

public class UniqueElements {
    public static void main(String[] args) {
        int[] newArr = {2, 3, 2, 3, 8, 0};
        System.out.println(Arrays.toString(uniqueElements(newArr)));
    }
    public static int[] uniqueElements(int[] array) {
        for(int i = 0; i < array.length-1; i++) {
            for(int j = i + 1; j < array.length; j++){
                if (array[i] == array[j]){
//                    array = ArrayUtils.remove(array, j);
                }
            }
        }
        return array;
    }
}
