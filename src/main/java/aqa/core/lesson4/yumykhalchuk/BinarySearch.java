package main.java.aqa.core.lesson4.yumykhalchuk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[100];
        Random rand = new Random();
        System.out.println("Array of random numbers are:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Array of sorted numbers are:");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter element of array: ");
        int element = Integer.parseInt(reader.readLine());
        int leftPartOfArr = 0;
        int rightPartOfArr = arr.length - 1;
        int middle = (leftPartOfArr + rightPartOfArr) / 2;
        while (leftPartOfArr <= rightPartOfArr) {
            if (arr[middle] < element) {
                leftPartOfArr = middle + 1;
            } else if (arr[middle] == element) {
                System.out.printf(element + " found at location %d %n", middle);
                break;
            } else {
                rightPartOfArr = middle - 1;
            }
            middle = (leftPartOfArr + rightPartOfArr) / 2;
        }
        if (leftPartOfArr > rightPartOfArr) {
            System.out.println(element + " is not present in the list.\n");
        }


    }
}

