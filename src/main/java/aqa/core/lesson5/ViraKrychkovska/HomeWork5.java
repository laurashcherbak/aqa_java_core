package aqa.core.lesson5.ViraKrychkovska;

import java.util.ArrayList;
public class HomeWork5 {
//    // 1
//    public int[] uniqueElements(int[] args) {
//        int arr[] = {4, 5, 5, 4, 5, 6, 5, 8, 4, 7};
//
//        ArrayList<Integer> uniqueArr = new ArrayList<Integer>();
//        for (int i = 0; i < arr.length; i++) {
//
//            int k = 0;
//            if (!uniqueArr.contains(arr[i])) {
//                uniqueArr.add(arr[i]);
//                k++;
//
//                for (int j = i; j < args.length; j++) {
//                    if (arr[i] == arr[j]) {
//                        k++;
//                    }
//                }
//            }
//        }
//        return args;
//    }
//
//    // 2
//    public int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
//
//        int[] firstArray = {1, 3, 5, 7, 9};
//        int[] secondArray = {2, 4, 6, 8, 10};
//        int fal = firstArray.length;
//        int sal = secondArray.length;
//        int[] result = new int[fal + sal];
//        System.arraycopy(firstArray, 0, result, 0, fal);
//        System.arraycopy(secondArray, 0, result, fal, sal);
//        return result;
//    }
//
//
//// 3
//
//    public int[] commonElements(int[] arr1, int[] arr2) {
//        int[] arr11 = {1, 2, 3, 4, 5};
//        int[] arr22 = {1, 10, 3, 15, 5};
//        for (int i = 0; i < arr11.length; i++) {
//            for (int j = 0; j < arr22.length; j++) {
//                if (arr11[i] == arr22[j]) {
//                    return arr11[i];
//                }
//            }
//        }
//    }
//
//    // 4
//    public int[] reverseArray(int[] arr) {
//        int[] array = {1, 2, 3, 4, 5};
//        for (int i = 0; i < array.length / 2; i++) {
//            int temp = array[i];
//            array[i] = array[array.length - i - 1];
//            array[array.length - i - 1] = temp;
//        }
//        return arr;
//    }
//
//    //5
//    public int[] sortEvenPositionArray(int[] arr) {
//        int[] array = {45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8};
//        int temp;
//        for (int i = 1; i < array.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (array[j] < array[j - 1]) {
//                    temp = array[j];
//                    array[j] = array[j - 1];
//                    array[j - 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            return arr;
//        }
//    }
}
