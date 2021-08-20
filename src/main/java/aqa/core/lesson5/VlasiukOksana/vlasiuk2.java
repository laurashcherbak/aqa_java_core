package aqa.core.lesson5.VlasiukOksana;

import java.io.*;
import java.util.*;

import java.util.Arrays;
import java.util.List;

public class vlasiuk2 {

//    /**
//     * Implement the method that merges two arrays into one. Resulting array should consist of elements that present only in the one array and absent in other
//     * <p>
//     * Example:
//     * arr1 - [1, 2, 4, 5],  arr2 - [1, 3, 7, 5]
//     * output array - [2, 3, 4, 7]
//     *
//     * @param arr1 - first input array with unique elements
//     * @param arr2 - second input array with unique elements
//     * @return array with not common elements from input arrays
//     */

    public static void main(String[] args) {

        // Make the two lists
        List<Integer> list1 = Arrays.asList(1, 2, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 3, 7, 5);
        // Prepare a union
        Set<Integer> union = new HashSet<Integer>(list1);
        union.addAll(list2);
        // Prepare an intersection
        Set<Integer> intersection = new HashSet<Integer>(list1);
        intersection.retainAll(list2);
        // Subtract the intersection from the union
        union.removeAll(intersection);
        // Print the result
        for (Integer n : union) {
            System.out.print(n + " ");
        }
    }
}
