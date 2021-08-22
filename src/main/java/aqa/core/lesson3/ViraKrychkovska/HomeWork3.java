package main.java.aqa.core.lesson3.ViraKrychkovska;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            if (i % 2 > 0) {
                System.out.println("Odd number is " + i);
            }

        }
    }

    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x = in.nextInt();
        System.out.print("Enter second number:");
        int y = in.nextInt();
        System.out.println("Choose the operation you want to perform");
        System.out.println("Choose 1 for ADDITION");
        System.out.println("Choose 2 for SUBTRACTION");
        System.out.println("Choose 3 for MULTIPLICATION");
        System.out.println("Choose 4 for DIVISION");
        System.out.println("Choose \"q\" for EXIT");
        System.out.println("Choose \"q\" for EXIT and enter any symbol to CONTINUE");
        int n = in.nextInt();
        switch (n) {
            case 1:
                int add;
                add = x + y;
                System.out.println("Result : " + add);
                break;

            case 2:
                int sub;
                sub = x - y;
                System.out.println("Result : " + sub);
                break;

            case 3:
                int mul;
                mul = x * y;
                System.out.println("Result : " + mul);
                break;

            case 4:
                float div;
                div = (float) x / y;
                System.out.print("Result : " + div);
                break;

            case 5:
                System.exit(0);
                break;

        }
    }
}

