package aqa.core.lesson5.Tymofiiuk;

import java.util.Arrays;

public class Main {
    public int[] uniqueElements(int[] arr) {
        int[] temp = new int[arr.length];
        int i = 0;
        for(int j = 0; j < arr.length; j++) {
            for(int k = 0; k < temp.length; k++) {
                if(k == i) {
                    temp[i] = arr[j];
                    i++;
                    break;
                }
                if(arr[j] == temp[k]) {
                    break;
                }
            }
        }
        int[] ret = new int[i];
        for(int j = 0; j < i; j++) {
            ret[j] = temp[j];
        }
        return ret;
    }
    public int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        int m = 0;
        for(int i = 0, j = 0; i < Math.max(arr1.length, arr2.length); i++, j++) {
            if(i < arr1.length) {
                for (int k = 0; k < arr2.length + 1; k++) {
                    if(k == arr2.length) {
                        temp[m] = arr1[i];
                        m++;
                        break;
                    }
                    if(arr1[i] == arr2[k]) {
                        break;
                    }
                }
                for (int k = 0; k < arr1.length + 1; k++) {
                    if(k == arr1.length) {
                        temp[m] = arr2[i];
                        m++;
                        break;
                    }
                    if(arr2[i] == arr1[k]) {
                        break;
                    }
                }
            }
        }
        int[] ret = new int[m];
        for(int j = 0; j < m; j++) {
            ret[j] = temp[j];
        }
        return uniqueElements(ret);
    }
    public int[] commonElements(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        int m = 0;
        for(int i = 0, j = 0; i < Math.max(arr1.length, arr2.length); i++, j++) {
            if(i < arr1.length) {
                for (int k = 0; k < arr2.length; k++) {
                    if(arr1[i] == arr2[k]) {
                        temp[m] = arr1[i];
                        m++;
                        break;
                    }
                }
                for (int k = 0; k < arr1.length; k++) {
                    if(arr2[i] == arr1[k]) {
                        temp[m] = arr2[i];
                        m++;
                        break;
                    }
                }
            }
        }
        int[] ret = new int[m];
        for(int j = 0; j < m; j++) {
            ret[j] = temp[j];
        }
        return uniqueElements(ret);
    }
    public int[] reverseArray(int[] arr) {
        int[] ret = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            ret[arr.length - i - 1] = arr[i];
        }
        return ret;
    }
    public int[] sortEvenPositionArray(int[] arr) {
        int[] temp;
        if(arr.length % 2 == 1) {
            temp = new int[arr.length / 2 + 1];
        } else {
            temp = new int[arr.length / 2];
        }
        int j = 0;
        for(int i = 0; i < arr.length; i+=2, j++) {
            temp[j] = arr[i];
        }
        temp = Arrays.stream(temp).sorted().toArray();
        int[] ret = new int[arr.length];
        for(int i = 1; i < arr.length; i+=2) {
            ret[i] = arr[i];
        }
        j = 0;
        for(int i = 0; i < arr.length; i+=2, j++) {
            ret[i] = temp[j];
        }
        return ret;
    }
    public static void main(String[] args) {

        Main m = new Main();
        int[] TestArray = {1, 2, 5, 2, 4};
        TestArray = m.uniqueElements(TestArray);
        System.out.println("uniqueElements:");
        for (int i = 0; i < TestArray.length; i++) {
            System.out.print(TestArray[i] + " ");
        }
        System.out.println();

        System.out.println("uniqueElementsMergeArray:");
        int[] TestArray1 = {1, 2, 4, 5};
        int[] TestArray2 = {1, 3, 7, 5};
        TestArray = m.uniqueElementsMergeArray(TestArray1, TestArray2);
        for (int i = 0; i < TestArray.length; i++) {
            System.out.print(TestArray[i] + " ");
        }
        System.out.println();

        System.out.println("commonElements:");
        int[] TestArray3 = {1, 2, 3};
        int[] TestArray4 = {2, 3, 4};
        TestArray = m.commonElements(TestArray3, TestArray4);
        for (int i = 0; i < TestArray.length; i++) {
            System.out.print(TestArray[i] + " ");
        }
        System.out.println();

        System.out.println("reverseArray:");
        TestArray = new int[] {1, 2, 3, 4};
        TestArray = m.reverseArray(TestArray);
        for (int i = 0; i < TestArray.length; i++) {
            System.out.print(TestArray[i] + " ");
        }
        System.out.println();

        System.out.println("sortEvenPositionArray:");
        TestArray = new int[] {3, 7, 1, 4, 2};
        TestArray = m.sortEvenPositionArray(TestArray);
        for (int i = 0; i < TestArray.length; i++) {
            System.out.print(TestArray[i] + " ");
        }
        System.out.println();
    }
}
