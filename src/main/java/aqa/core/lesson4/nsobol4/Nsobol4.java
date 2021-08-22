package aqa.core.lesson4.nsobol4;

import java.util.Arrays;

public class Nsobol4 {
    //Task 1
    public static void linearSearch(int[] arr, int val) {
        int index = -1;
        int iterations = 0;
        for (int x = 0; x < arr.length; x = x + 1) {
            iterations++;
            if (arr[x] == val) {
                index = x;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element does not exist");
        } else {
            System.out.println(index + " - iterations:" + iterations);
        }
    }

    //Task 2
    public static void binarySearch(int[] arr, int val) {
        int index = -1;
        int iterations = 0;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            iterations++;
            int middle = left + (right - left) / 2;

            if (arr[middle] == val) {
                index = middle;
                break;
            } else if (arr[middle] < val) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        if (index == -1) {
            System.out.println("Element does not exist");
        } else {
            System.out.println(index + " - iterations:" + iterations);
        }
    }

    public static void main(String[] args) {
        int intArr[] = {55, 57, 61, 66, 18, 19, 27, 38, 10, 11, 15, 39, 51, 82, 83,
                95, 25, 45, 46, 47, 48, 52, 53, 56, 1, 2, 3, 4, 5, 6, 7, 8, 9, 12,
                13, 14, 15, 16, 17, 20, 21, 22, 23, 24, 28, 30, 31, 32, 33, 34, 36,
                37, 58, 59, 60, 62, 63, 64, 67, 69, 71, 72, 73, 74, 76, 78, 79, 80,
                81, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94};
        Arrays.sort(intArr);

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println("");

        linearSearch(intArr, 51);
        binarySearch(intArr, 51);
    }
}
