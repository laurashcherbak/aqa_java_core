package aqa.core.lesson4.MykhailoOsadtsiv;

import java.util.Arrays;
import java.util.Random;

public class HomeWork4 {
    public static void main(String[] args) {
        int[] arr1 = new int[100];
        int[] arr2 = new int[100];
        Random random = new Random();
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(searchArr1(arr1, 33));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println(searchArr2(arr2, 44));
    }

    public static int searchArr1(int[] arr, int searchValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }

    public static int searchArr2(int[] arr, int searchValue) {
        //System.out.println(Math.log(arr.length) / Math.log(2));
        int x = arr.length / 2;
        int i =0;
        while (i <= Math.log(arr.length) / Math.log(2)) { //2 в 7степені більше 100
            if (searchValue == arr[x]) {
                return x;
            } else if (searchValue < arr[x]) {
                x = x - x / 2;
                i++;
            } else {
                x = x + x / 2;
                i++;
            }
        }
        return -1;
    }

}
