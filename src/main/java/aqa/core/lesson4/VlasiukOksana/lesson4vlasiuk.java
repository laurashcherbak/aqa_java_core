package aqa.core.lesson4.VlasiukOksana;

import java.util.Scanner;


public class lesson4vlasiuk {

    // linearSearch

    public static void main(String args[]) {
        int c, n, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Enter those " + n + " elements");

        for (c = 0; c < n; c++)
            array[c] = in.nextInt();

        System.out.println("Enter value to find");
        search = in.nextInt();

        for (c = 0; c < n; c++) {
            if (array[c] == search) {
                System.out.println(search + " is present at location " + (c + 1) + ".");
                break;
            }
        }
        if (c == n)
            System.out.println(search + " isn't present in array.");
    }

    // binary search

    public static void binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }
}



