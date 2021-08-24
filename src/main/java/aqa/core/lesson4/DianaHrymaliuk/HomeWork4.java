package aqa.core.lesson4.DianaHrymaliuk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HomeWork4 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int b = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number: ");
        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < 100; i++) {
            if (arr[i] == a) {
                b = 1;
            }
        }
        if (b == 1) {
            System.out.println("The entered number is in an array");
        } else {
            System.out.println("The entered number is not in the array");
        }

        System.out.print("Enter number for binary search: ");
        a = Integer.parseInt(br.readLine());
        int l = 0;
        int h = 99;
        int mid;

        while (l <= h) {
            mid = (l + h) / 2;
            if (mid < a) {
                l = mid + 1;
            } else {
                if (mid > a) {
                    h = mid - 1;
                } else {
                    System.out.println("The entered number is in an array");
                    break;
                }
            }
        }
        if (a > arr.length) {
            System.out.println("The entered number is not in the array");
        }
        if (a < 0) {
                System.out.println("The entered number is not in the array");
            }
        }
    }
