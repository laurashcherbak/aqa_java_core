package aqa.core.lesson3.vlasiuk;

import java.util.Scanner;

public class VlasiukOksana {
    public static void main(String[] arg){
        int n = 20;
        System.out.print("Odd numbers from 1 to " + n + " are: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        //Task 2

        int num1;
        int num2;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number");
        num1 = input.nextInt();

        System.out.println("Please enter the second number");
        num2 = input.nextInt();

        Scanner op = new Scanner (System.in);

        System.out.println("Please enter the operation");
        operation = op.next();

        if (operation.equals("+"))
        {
            System.out.println("Your answer is "+(num1 + num2));
        }
        else if (operation.equals("-"))
        {
            System.out.println("Your answer is "+(num1 - num2));
        }
        else if (operation.equals("*"))
        {
            System.out.println("Your Aanswer is "+(num1 * num2));
        }
        else if (operation.equals("/"))
        {
            System.out.println("Your answer is "+(num1 / num2));
        }
    }
}
