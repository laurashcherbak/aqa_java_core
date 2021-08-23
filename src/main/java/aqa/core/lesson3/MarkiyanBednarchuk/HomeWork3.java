package aqa.core.lesson3.MarkiyanBednarchuk;

import java.util.Scanner;

public class HomeWork3 {
    //Task1
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int number : array)
            if (number % 2 == 0)
                System.out.println("Pair number:" + (number));
        calculator();
    }
    public static void calculator() {
        //Task2
        int e = 0;
        while (e != 'q') {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number: ");
            int a = in.nextInt();
            System.out.println("Choose the arithmetic operations +, -, *, /: ");
            char b = in.next(".").charAt(0);
            System.out.println("Enter second number: ");
            int c = in.nextInt();
            if (b == '+') {

                int d = a + c;
                System.out.println("Result: " + (d));
            } else if (b == '-') {
                int d = a - c;
                System.out.println("Result: " + (d));
            } else if (b == '*') {
                int d = a * c;
                System.out.println("Result: " + (d));
            } else if (b == '/') {
                int d = a / c;
                System.out.println("Result: " + (d));
            }
            System.out.println("Press 'q' to exit or 'm' to enter another number");
            e = in.next(".").charAt(0);
        }
        System.exit(0);
    }
}
