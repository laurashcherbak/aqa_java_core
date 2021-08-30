/*
Homework 4.
Implement linear and binary search inside array (100 elements inside)

 */

package aqa.core.lesson4.LauraShcherbak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork4 {

    public static void main(String[] args) throws IOException {

        System.out.println("Create and fill sorted array[100]...");
        int[] arr = new int[100];
        for(int i = 0; i < 100; i++) {
            arr[i] = i + 1;
            //System.out.print(arr[i]);
        }

        System.out.println("Linear search...");
        int n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number : ");
        n = Integer.parseInt(br.readLine());

        int r = 0;
        for(int i = 0; i < 100; i++) {
            if(arr[i] == n) {
                r = 1;
            }
        }

        if(r == 1) {
            System.out.println("Number is found");
        } else {
            System.out.println("Number is not found");
        }


        System.out.println("Binary search...");

        System.out.print("Enter number : ");
        n = Integer.parseInt(br.readLine());

        int f = 0;
        int l = 99;

        int m = (f + l)/2;

        while (f <= l) {
            if(arr[m] > n) {
                l = m - 1;
            } else if(arr[m] < n) {
                f = m + 1;
            } else {
                System.out.println("Number is found");
                break;
            }

            m = (f + l)/2;

        }

        if(f > l) {
            System.out.println("Number is not found");
        }


    }

}
