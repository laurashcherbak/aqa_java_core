package main.java.aqa.core.lesson2.yumykhalchuk;

/*    6.	Write a program that reads from console integer value and write to console value that is 2 times more than input.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReadProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer : ");
        int i = Integer.parseInt(reader.readLine());
        int result = 2*i;
        System.out.println(result);
    }
}





