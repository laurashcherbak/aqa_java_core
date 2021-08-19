package aqa.core.lesson4.kfedechko;

import java.util.Random;

public class ArrayHomeWork {

    public static void main(String[] args) {
        int[] intArr = new int[100];
        Random rd = new Random();
        for (int i = 0; i < 100; i++) {
            intArr[i] = rd.nextInt();
        }

        int searchNumber = intArr[38];
        System.out.println("searching number = " + searchNumber);

        // linear search
        for (int i = 0; i < intArr.length; i++) {
            if (searchNumber == intArr[i]) {
                System.out.println("number was found on index " + i);
            }
        }

        // binary search
        bubbleSort(intArr);

        System.out.println("sorted array is:");
        for (int value : intArr) {
            System.out.print(value + " ");
        }

        System.out.println();
        binarySearch(intArr, 0, intArr.length - 1, searchNumber);

    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    private static void binarySearch(int[] arr, int first, int last, int searchNumber) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < searchNumber) {
                first = mid + 1;
            } else if (arr[mid] == searchNumber) {
                System.out.println("searchNumber " + searchNumber + " is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("searchNumber is not found!");
        }
    }
}
