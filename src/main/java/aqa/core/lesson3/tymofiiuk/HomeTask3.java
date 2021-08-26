package aqa.core.lesson3.tymofiiuk;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HomeTask3 {
    public static void main(String[] args) throws IOException {
        //task1
        System.out.println("Odd numbers:");
        for (int i = 1; i < 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        //task2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            double result;
            System.out.println("Enter number 1:");
            String g = br.readLine();
            if (g.equals("q"))
                System.exit(0);
            double f = Double.parseDouble(g);
            System.out.println("Enter arithmetic operation:");
            char sym = br.readLine().charAt(0);
            if (sym == ('q'))
                System.exit(0);
            System.out.println("Enter number 2:");
            String h = br.readLine();
            if (h.equals("q"))
                System.exit(0);
            double s = Double.parseDouble(h);
            switch (sym) {
                case '+':
                    result = f + s;
                    break;
                case '-':
                    result = f - s;
                    break;
                case '*':
                    result = f * s;
                    break;
                case '/':
                    result = f / s;
                    break;
                default:
                    System.out.println("Try again");
                    return;
            }
            System.out.println("Result:\n" + result);
        }
    }
}