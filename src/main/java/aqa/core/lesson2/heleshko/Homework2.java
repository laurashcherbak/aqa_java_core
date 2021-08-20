package aqa.core.lesson2.heleshko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.sqrt;

public class Homework2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello human!");

        int a = 5;
        byte b = 10;
        short c = 0b100;
        long d = 1234567890;
        float e = 5.5f;
        double h = 55.6;
        char q = 'a';
        boolean r = true;

        System.out.printf("\nThis is a value: " + a);
        System.out.printf("\nThis is b value: " + b);
        System.out.printf("\nThis is c value: " + c);
        System.out.printf("\nThis is d value: " + d);
        System.out.printf("\nThis is e value: " + e);
        System.out.printf("\nThis is h value: " + h);
        System.out.printf("\nThis is q value: " + q);
        System.out.printf("\nThis is r value: " + r);


        System.out.println("\nsum of two digits = " + (a + b));

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer: ");
        int i = Integer.parseInt(br.readLine());
        System.out.println("Doubled value: " + i * 2);

        System.out.println("\nExpression calculation: 14/209+14*(29-13*13+14/3)=" + (14.0 / 209 + 14 * (29 - 13 * 13 + 14.0 / 3)));

        double expression1 = 5 + 2 * (3 * 3);
        double expression2 = 7.0;
        double expression3 = 4 * 4;
        double expression4 = 5 + 2 * 2;

        System.out.println("Expression calculation: (5+2*(3*3))/sqrt(7.0*((4*4)/5+2*2))=" + (expression1 / sqrt(expression2 * (expression3 / expression4))));
    }
}
