package aqa.core.lesson4.akylo.nsobol4;

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
        }
        else {
            System.out.println(index + " - iterations:" + iterations);
        }
    }

    //Task 2
    public static void binarySearch(int[] arr, int val) {
        int index = -1;
        int iterations = 0;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            iterations++;
            int middle = left + (right - left) / 2;

            if (arr[middle] == val){
                index = middle;
                break;
            }
            else if (arr[middle] < val) {
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
        }

        if (index == -1) {
            System.out.println("Element does not exist");
        }
        else {
            System.out.println(index + " - iterations:" + iterations);
        }
    }

    public static void main(String[] args) {
        int intArr[] = {55, 57, 61, 66, 18, 19, 27, 38, 10, 11, 15, 39, 51, 82, 83, 95};
        Arrays.sort(intArr);

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println("");

        linearSearch(intArr,51);
        binarySearch(intArr, 51);
    }
}
