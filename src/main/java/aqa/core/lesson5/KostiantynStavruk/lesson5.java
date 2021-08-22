package aqa.core.lesson5.KostiantynStavruk;

import java.util.Arrays;


public class lesson5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5};
        int[] arr2 = {1, 3, 7, 5};

        System.out.println("arr1 array: " + Arrays.toString(arr1));
        System.out.println("arr2 array: " + Arrays.toString(arr2));
        System.out.println("\n----------#task_1----------");
        int[] task1Result = uniqueElements(arr1);
        System.out.println(Arrays.toString(task1Result));

        System.out.println("----------#task_2----------");
        int[] task2Result = uniqueElementsMergeArray(arr1, arr2);
        System.out.println(Arrays.toString(task2Result));
        System.out.println("----------#task_3----------");

        int[] task3Result = commonElements(arr1, arr2);
        System.out.println(Arrays.toString(task3Result));
        System.out.println("----------#task_4----------");

        int[] task4Result = reverseArray(arr1);
        System.out.println(Arrays.toString(task4Result));
        System.out.println("---------------------------\n");


        int[] arr3 = {3, 7, 1, 4, 2};
        System.out.println("arr3 array: " + Arrays.toString(arr3));
        System.out.println("\n----------#task_5----------");
        int[] task5Result = sortEvenPositionArray(arr3);
        System.out.println(Arrays.toString(task5Result));


    }

    public static int[] uniqueElements(int[] arr) {
        int[] result = new int[0];
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
            if (i == j) {
                int[] arr3 = new int[result.length + 1];
                System.arraycopy(result, 0, arr3, 0, result.length);
                arr3[arr3.length - 1] = arr[i];
                result = arr3;
            }
        }
        return result;
    }

    public static int[] uniqueElementsMergeArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        result = uniqueElements(result);
        return result;
    }

    public static int[] commonElements(int[] arr1, int[] arr2) {
        int[] result = new int[0];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    int[] arr3 = new int[result.length + 1];
                    System.arraycopy(result, 0, arr3, 0, result.length);
                    arr3[arr3.length - 1] = arr1[i];
                    result = arr3;
                }
            }
        }
        return result;
    }

    public static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[j] = arr[i];
            j++;
        }
        return result;
    }

    public static int[] sortEvenPositionArray(int[] arr) {
        for (int i = 0; i < arr.length; i += 2) {
            for (int j = 0; j < arr.length - 1 - i; j += 2) {
                if (arr[j] > arr[j + 2]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 2];
                    arr[j + 2] = temp;
                }
            }
        }
        return arr;
    }

}




