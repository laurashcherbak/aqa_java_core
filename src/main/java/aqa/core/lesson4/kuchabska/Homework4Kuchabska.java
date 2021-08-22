package main.java.aqa.core.lesson4.kuchabska;

public class Homework4Kuchabska {
    public static void main(String[] args) {

        int arr[] = new int[100];

        // Found value
        int key = 8;

        // create array
        for (int i = 0; i < 100; i++) {
            arr[i] = i * 2;
        }


        // Linear search
        int found_idx = -1;
        System.out.println("Linear search");
        for (int i = 0; i < 100; i++) {
            if (arr[i] == key) {
                found_idx = i;
                break;
            }
        }

        if (found_idx >= 0) {
            System.out.println("Element found!");
            System.out.println("Element index: " + found_idx);
        } else {
            System.out.println("Element is not found!");
        }

        // sort array (sorting bubble) for binary search algorithm
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        // binary search algorithm
        // Linear search
        System.out.println("Binary search");
        int found_element_index = -1;
        int first = 0;
        int last = arr.length - 1;
        int mid = (first + last) / 2;
        while(first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                found_element_index = mid;
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }

        // Result of algorithm
        if (found_element_index >= 0) {
            System.out.println("Element found!");
            System.out.println("Element index: " + found_element_index);
        } else {
            System.out.println("Element is not found!");
        }
    }
}
