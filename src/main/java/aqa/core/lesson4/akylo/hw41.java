package aqa.core.lesson4.akylo;

import java.util.Scanner;
import java.util.Arrays;
public class hw41 {
    public static void main(String[] args) {
        int[] arr = {1221,2345,4534,5645,2342,67567,78768,789789,234234,322,2,23,232,21,0,1};

        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.print("Hello Andrii Kylo! Please input any number of the array above: ");
        int x = in.nextInt();
        in.close();

        int counter = 0;
        for (int i = 0; i < arr.length; i+=1) {
            if (x == arr[i]) {
                System.out.println("The digit " +x +" has index " + i + " and number " +(i+1));
            }
            else counter += 1;
            if (counter == arr.length) {
                System.out.println("The digit " +x +" not found in the array");
            }
        }
    }
}

