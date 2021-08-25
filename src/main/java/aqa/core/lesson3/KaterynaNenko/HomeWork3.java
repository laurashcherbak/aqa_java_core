package aqa.core.lesson3.KaterynaNenko;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 20) {
            System.out.println(+i);
            i += 2;
        }

        Scanner scan = new Scanner(System.in);
        int x = 0, y = 0;
        char operator, q = 0;
        while (q != 'q') {
            System.out.println("Enter the first number:");
            x = scan.nextInt();
            System.out.println("Enter the operator: + - * /");
            operator = scan.next(".").charAt(0);
            System.out.println("Enter the second number:");
            y = scan.nextInt();

            if (operator == '+') {
                int a = x + y;
                System.out.println("Result is:" + (a));
            } else if (operator == '-') {
                int a = x - y;
                System.out.println("Result is:" + (a));
            } else if (operator == '*') {
                int  a = x * y;
                System.out.println("Result is:" + (a));
            } else if (operator == '/') {
                int  a = x / y;
                System.out.println("Result is:" + (a));
            } else {
                System.out.println("Something went wrong. Please try again.");
                System.exit(0);
            }
            System.out.println("If you want to use the calculator again, please press any number. Please enter q for exit");
            q = scan.next(".").charAt(0);


        }
    }
}

