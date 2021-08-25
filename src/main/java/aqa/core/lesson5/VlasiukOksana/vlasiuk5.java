package aqa.core.lesson5.VlasiukOksana;
import java.util.*;
public class vlasiuk5 {

//    /**
//     * Implement the method that sorts elements of an array that place on even positions  (indexes: 0, 2, 4 ...)
//     * <p>
//     * Example:
//     * input array - [3, 7, 1, 4, 2]
//     * output array - [1, 7, 2, 4, 3]
//     *
//     * @param arr - input array
//     * @return - sorted array of elements on even positions
//     */

    public static void main(String[] args) {

        //Initialize array
        int [] arr = new int [] {3, 7, 1, 4, 2};

        System.out.println("Elements of given array present on even position: ");
        //Loop through the array by incrementing value of i by 2
        //Here, i will start from 1 as first even positioned element is present at position 1.
        for (int i = 0; i < arr.length; i = i+2) {
            System.out.print(arr[i] + " ");
        }
    }
}
