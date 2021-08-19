package aqa.core.lesson3.vlasiuk;

import java.util.Scanner;

public class VlasiukOksana {
    public static void main(String[] arg){
        int n = 20;
        System.out.print("Odd Numbers from 1 to " + n + " are: ");
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

        System.out.println("Please Enter The First Number");
        num1 = input.nextInt();

        System.out.println("Please Enter The Second Number");
        num2 = input.nextInt();

        Scanner op = new Scanner (System.in);

        System.out.println("Please Enter The Operation");
        operation = op.next();

        if (operation.equals("+"))
        {
            System.out.println("Your Answer is "+(num1 + num2));
        }
        else if (operation.equals("-"))
        {
            System.out.println("Your Answer is "+(num1 - num2));
        }
        else if (operation.equals("*"))
        {
            System.out.println("Your Answer is "+(num1 * num2));
        }
        else if (operation.equals("/"))
        {
            System.out.println("Your Answer is "+(num1 / num2));
        }
    }
}
