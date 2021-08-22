package aqa.core.lesson3.yumykhalchuk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 1.	Write a program that will print to console all numbers which are:
- even if your ordinal is even
- odd number if your ordinal is odd
in the range 0-20
My ordinal number is 15
*/
public class OddNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your ordinal number: ");
        int myN = Integer.parseInt(reader.readLine());
        System.out.println("Your ordinal number is odd");
        System.out.print("All odd numbers in the range 0-20 are:");
        for(int i = 0; i <= 20; i++){
            if(i % 2 != 0){
                System.out.print(" " + i );
            }
        }
    }

}

