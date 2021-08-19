package main.java.aqa.core.lesson4.akylo.ViraKrychkovska;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_4 {
    //Part 1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out .println("Linear search on array");
        int length = 100;
        int[] input = new int[length];
        System.out.printf("Enter numbers", length);
        for (int i = 0; i < length; i++) {
            input[i] = in.nextInt();
        }
        System.out.println("Enter target number");
        int target = in.nextInt();
        int index = linearSearch(input, target);
        if (index == -1) { System.out.printf("Sorry, number is not found in array", target);
        }
        else { System.out.printf("Number is found in array at index", target, index);
        }
    }
    public static int linearSearch(int[] input, int target) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == target) {
                return i;
            }
        }
        return -1;
    }
    // Part 2
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out .println("Linear search on array");
        int number = 100;
        int[] input = new int[number];
        System.out.println("The input Array : " + Arrays.toString(number));
        System.out.printf("Enter numbers", number);
        for (int i = 0; i < number; i++) {
            input[i] = in.nextInt();
        }
        int result = Arrays.binarySearch(number);
        if (result < 0)
            System.out.println("Number is not found in the array!");
        else
            System.out.println("Number is found at index: "+result + " in the array.");
    }
}
