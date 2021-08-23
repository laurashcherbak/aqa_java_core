package aqa.core.lesson4.heleshko;

public class Homework4 {

    public static void linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element is found with linear search at index: " + i);
                return;
            }
        }
        System.out.println("Element wasn't found!");
    }

    public static void binarySearch(int[] arr, int key) {
        int first = 0;
        int last = arr.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element is found with binary search at index: " + mid);
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

    public static void main(String[] args) {
        int[] valuesArray = new int[100];
        for (int i = 0; i < 100; i++) {
            valuesArray[i] = i * i;
        }
        int key = 144;
        linearSearch(valuesArray, key);
        binarySearch(valuesArray, key);
    }
}