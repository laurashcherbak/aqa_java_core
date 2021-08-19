package aqa.core.lesson4.LiubovPylypenko;

import java.util.Arrays;

public class HomeTasks4 {

    public static void main(String args[])
    {
        //value for search
        int x = 72;

        //array size
        int arraySize = 100;
        int arr[] = new int[arraySize];

        for (int i = 0; i < arraySize; i++)
        {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println("Output initial values.");
        System.out.println(Arrays.toString(arr));

        // linear search section
        System.out.println("Linear search has been started...");
        int result = linearSearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);

        System.out.println("Linear search has been completed");

        System.out.println("Sort array for next binary search.");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // Binary search section
        System.out.println("Binary search has been started...");
        int n = arr.length;
        result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
        System.out.println("Binary search has been completed");
    }

    public static int linearSearch(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int arr[], int left, int right, int x)
    {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, left, mid - 1, x);

            return binarySearch(arr, mid + 1, right, x);
        }
        return -1;
    }

}
