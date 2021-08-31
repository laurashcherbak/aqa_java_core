package aqa.core.lesson4.lesson4Skrypak;

import java.util.Arrays;

public class lesson4skrypak {

    public static void main(String[] arg) {
        int[] arrSearch = {56, 465, 479, 709, 12, 3, 8, 235, 90, 45, 23, 1, 9, 40, 23, 12, 2, 13, 4, 5, 6, 7, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 91, 41, 78, 69, 34, 36, 38, 122, 190, 189, 339, 999, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 345, 347, 378, 456, 4689, 345, 897, 567, 876, 85, 87, 97, 76, 54, 74, 34, 365, 98, 34, 85, 74, 9876, 234, 546, 98};

        System.out.println(arrSearch.length);
        System.out.println(linear(arrSearch, 12));

        // binary search

        Arrays.sort(arrSearch);
        int key = 12;
        int first = 0;
        int last = arrSearch.length - 1;
        int middle = (first + last) / 2;
        while (first <= last) {
            if (arrSearch[middle] < key) {
                first = middle - 1;
            } else if (arrSearch[middle] == key) {
                System.out.println(middle);
                break;
            } else {
                last = middle + 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Not exists!");
        }
    }
    public static int linear(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static String linearSearch(String args[]){
        int[] arr = {12, 2, 13, 4, 5, 6, 7, 10, 11, 12, 14, 15, 16, 17, 18, 19, 20, 91, 41, 78, 69, 34, 36, 38, 122, 190, 345, 347, 378, 456, 4689, 345, 897};
        int x = 12;
        int result = linear(arr, x);
        if(result == -1){
            return("not found");
        }else{
            return("Element" + result);
        }
    }



}
