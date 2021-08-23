package aqa.core.lesson5.akylo.MarkiyanBednarchuk;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,8,7};
        int[] arr2 = {1,3,4,7};
        int[] arr3 = {3, 7, 1, 4, 2};

        System.out.println("First array: " + Arrays.toString(arr1));
        System.out.println("Second array: " + Arrays.toString(arr2));
        System.out.println("Third array: " + Arrays.toString(arr3));
        System.out.println("\nTask1");
        int[] task1Result = uniqueElements(arr1);
        System.out.println(Arrays.toString(task1Result));

        System.out.println("Task2");
        int[] task2Result = uniqueElementsMergeArray(arr1, arr2);
        System.out.println(Arrays.toString(task2Result));
        System.out.println("Task3");

        int[] task3Result = commonElements(arr1, arr2);
        System.out.println(Arrays.toString(task3Result));
        System.out.println("Task4");

        int[] task4Result = reverseArray(arr1);
        System.out.println(Arrays.toString(task4Result));

        System.out.println("Task5");
        int[] task5Result = sortEvenPositionArray(arr3);
        System.out.println(Arrays.toString(task5Result));
    }

    public static int[] uniqueElements(int[] arr) {
        int[] res = new int[arr.length];
        int resIndex = 0;
        int unqiueCount = 0;
        for(int i =0; i<arr.length; i++){
            int elem = arr[i];
            boolean isInResult = false;
            for (int j = 0; j < res.length; j++) {
                if (elem == res[j]) {
                    isInResult = true;
                    break;
                }
            }
            if (!isInResult){
                unqiueCount++;
                res[resIndex++] = elem;
            }
        }
        return res;
    }
    public static int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, res, 0, arr1.length);
        System.arraycopy(arr2, 0, res, arr1.length, arr2.length);
        res = uniqueElements(res);
        return res;
    }
    public static int[] commonElements(int[] arr1, int[] arr2) {
        int[] res = new int[0];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    int[] arr3 = new int[res.length + 1];
                    System.arraycopy(res, 0, arr3, 0, res.length);
                    arr3[arr3.length - 1] = arr1[i];
                    res = arr3;
                }
            }
        }
        return res;
    }
    public static int[] reverseArray(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[arr.length - i - 1] = arr[i];
        }
        return res;
    }
    public static int[] sortEvenPositionArray(int[] arr) {
        int[] res = new int[arr.length/2 +1];
        int x = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            res[x] = arr[i];
            x = x + 1;

        }
        Arrays.sort(res);
        x = 0;
        for (int i = 0; i < arr.length; i = i +2) {
            arr [i] = res[x];
            x = x + 1;
        }
        return arr;
    }
}
