package aqa.core.lesson4.Yesyp;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {199, 9, 126, 113, 176, 1, 125, 28, 63, 66, 127, 79, 77, 167, 96, 71, 80, 164, 17, 144,
                123, 68, 155, 200, 86, 43, 171, 41, 83, 162, 190, 73, 27, 170, 47, 23, 119, 74, 61, 44, 82,
                21, 26, 91, 160, 56, 191, 48, 118, 130, 24, 181, 121, 85, 107, 64, 142, 180, 189, 95, 178,
                53, 192, 84, 185, 124, 31, 101, 110, 114, 186, 187, 134, 105, 161, 10, 184, 158, 153, 33, 94,
                58, 38, 60, 36, 37, 143, 7, 116, 99, 46, 29, 175, 166, 14, 102, 135, 138, 12, 35};
        Arrays.sort(arr);
        int elem = 160;
        boolean a = true;
        int x = 0;
        int y = arr.length-1;
        while (a) {
            int z = (x + y) / 2;
            if (arr[z] == elem) {
                System.out.println(z);
                a = false;
            } else ;
            if (arr[z] < elem) { x= z+1;
            } else
                y = z - 1;
        }
    }
}