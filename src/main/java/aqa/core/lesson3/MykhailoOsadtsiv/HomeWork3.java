package aqa.core.lesson3.MykhailoOsadtsiv;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }

        Scanner scan = new Scanner(System.in);
        double a, b;
        char c, q = '~';
        while (q != 'q') {
            System.out.println("Write first operand value:");
            a = scan.nextDouble();
            System.out.println("Write one operator value: + - * /");
            c = scan.next(".").charAt(0);
            System.out.println("Write second operand value:");
            b = scan.nextDouble();
            System.out.println("result is: ");

            if (c == '+') {
                double r = a + b;
                System.out.print(r);
            } else if (c == '-') {
                double r = a - b;
                System.out.print(r);
            } else if (c == '*') {
                double r = a * b;
                System.out.print(r);
            } else if (c == '/') {
                double r = a / b;
                System.out.print(r);
            } else {
                System.out.println("You write wrong operand, program is not for monkeys!");
                System.exit(0);
            }

            System.out.println(" Do you want to use calculator once more? q for exit, any other input to repeat");
            q = scan.next(".").charAt(0);

        }
    }
}
