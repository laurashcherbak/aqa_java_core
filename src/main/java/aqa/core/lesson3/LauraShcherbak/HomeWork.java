/*
1.Write a program that will print to console all numbers which are:
- even if your ordinal is even
- odd number if your ordinal is odd
in the range 0-20
2.Write a calculator.
Stages:
1 - prompt the user to enter a number
2 - then the sign of one of the arithmetic operations +, -, *, /.
3 - enter another number
4 - perform the operation, print the result, and offer to enter a new one
5 - If the user enters q, then stop the program

 */

package aqa.core.lesson3.LauraShcherbak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork {

    public static void main(String[] args) throws IOException {

        System.out.println("Part 1");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 > 0) {
                System.out.println(i);
            }
        }

        System.out.println("Part 2");
        double p1, p2, r;
        char op;

        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter number 1 :  ");
            p1 = Integer.parseInt(br.readLine());

            System.out.println("Enter the sign of the arithmetic operation : ");
            op = br.readLine().charAt(0);
            if (op == 'q') {
                break;
            }

            System.out.println("Enter number 2 : ");
            p2 = Integer.parseInt(br.readLine());

            if (op == '+') {
                r = p1 + p2;
                System.out.println("Result: "+r);
            }
            else if (op == '-') {
                r = p1 - p2;
                System.out.println("Result: "+r);
            }
            else if (op == '*') {
                r = p1 * p2;
                System.out.println("Result: "+r);
            }
            else if (op == '/') {
                if (p2 == 0) {
                    System.out.println("Can not divide by 0");
                }
                else {
                    r = p1 / p2;
                    System.out.println("Result: "+r);
                }
            }

        }

    }

}
