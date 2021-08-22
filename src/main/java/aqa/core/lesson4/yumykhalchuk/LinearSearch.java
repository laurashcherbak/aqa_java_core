package main.java.aqa.core.lesson4.yumykhalchuk;
/* Implement linear search inside array (100 elements inside)*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class LinearSearch {
    public static void main (String[] args) throws IOException {
        int[] arr = new int[100];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.println(arr[i]);
        }
        /* Пошук максимального значення */
        /*int numMax = arr[0];
        for (int k = 0; k < arr.length; k++){
            if(arr[k] > numMax){
            numMax = arr[k];
            }
        }
        System.out.println("Max number is:" + " " + numMax);*/

        /* Пошук індексу вказаного значення */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter element of array: ");
        int searchedIndex = 0;
        int element = Integer.parseInt(reader.readLine());
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == element) {
                searchedIndex = j;
            }
        }
        System.out.println("Element has" + " " + searchedIndex + " " + "index");
    }
}
