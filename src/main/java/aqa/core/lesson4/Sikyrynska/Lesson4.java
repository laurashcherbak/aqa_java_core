package aqa.core.lesson4.Sikyrynska;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {

        int data[] = {3, 10, 12, 7, 56, 60, 90, 35};
        int numberToFind = 10;
        int i = 0;
        int j = data.length;
        int m = j / 2;
        while (data[m] != numberToFind & i < j) {
            if (numberToFind > data[m]) {
                i = m + 1;
                m = ((i + j) / 2);
            } else {
                j = m - 1;
                m = ((i + j) / 2);
            }

        }
        if (i > j) {
            System.out.println("-1");
        } else {
            System.out.println(m);
        }
    }

        public static int linearSearch(int[] array, int elementToSearch){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == elementToSearch) {
                    return i;
                }
            }
            return -1;
        }
 }
