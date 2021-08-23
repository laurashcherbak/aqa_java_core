package aqa.core.lesson5.NataliaSkrypak;

import java.util.HashMap;
import java.util.*;

public class lesson5_1_Skrypak {
    public static void main(String args[]) {
        int[] myArray = {56, 98, 56, 12, 34, 5, 12, 34, 8, 2};
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for (int i = 0; i < myArray.length; i++) {
            hashmap.put(myArray[i], i);
        }
        System.out.println(hashmap.keySet());
    }

    void int[] mergedArray(int[] arr) {
        int[] arr1 = {56, 98, 56, 12, 34, 5};
        int[] arr2 = {45, 67, 32, 90, 45, 90};
        int[] mergedArray = new int[arr1.length + arr2.length];
        //Initializing pointers of arr1, arr2 and mergedArray with 0
        int a=0, b=0, c=0;
        //Inserting all elements of arr1into mergedArray
        while (a < arr1.length) {
            mergedArray[c] = arr1[a];
            c++;
            a++;
        }
        //Inserting all elements of arrayB into mergedArray
        while (b < arr2.length) {
            mergedArray[c] = arr2[b];
            c++;
            b++;
        }
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for (int s = 0; s < mergedArray.length; s++) {
            hashmap.put(mergedArray[s], s);
        }
        System.out.println(hashmap.keySet());
    }

    public int[] reverseArray(int[] arr) {
        static void reverse(Integer d[]) {
            Collections.reverse(Arrays.asList(d));
            System.out.println(Arrays.asList(d));
        }
        public static void (String[] args) {
            Integer [] arr = {56, 67, 34, 1, 20, 12, 987};
            reverse(arr);
        }
    }

    public int[] sortEvenPositionArray(int[] arr, int n) {
        Vector<Integer> evenArr = new Vector<Integer>();
        Vector<Integer> oddArr = new Vector<Integer>();
        for (int i = 0; i < n; i++) {
            if (i % 2 != 1) {
                evenArr.add(arr[i]);
            }
            else {
                oddArr.add(arr[i]);
            }
        }
        return evenArr[i];
    }
}
