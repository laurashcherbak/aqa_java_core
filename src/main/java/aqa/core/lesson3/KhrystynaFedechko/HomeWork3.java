package aqa.core.lesson3.KhrystynaFedechko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork3 {
    public static void main(String[] args) throws IOException {
        for (int i = 1; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();

        for (int x = 1; x < 20; x++) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter first Number:");
            String i = br.readLine();
            if (i.equals("q")) {
                System.exit(0);
            }
            System.out.println("Enter the sign of one of the arithmetic operations:");
            String sign = br.readLine();
            if (sign.equals("q")) {
                System.exit(0);
            }
            System.out.println("Enter second Number:");
            String j = br.readLine();
            if (j.equals("q")) {
                System.exit(0);
            }
            int result = 0;
            switch (sign) {
                case "+":
                    result = Integer.parseInt(i) + Integer.parseInt(j);
                    break;
                case "-":
                    result = Integer.parseInt(i) - Integer.parseInt(j);
                    break;
                case "*":
                    result = Integer.parseInt(i) * Integer.parseInt(j);
                    break;
                case "/":
                    result = Integer.parseInt(i) / Integer.parseInt(j);
                    break;
                default:
                    System.out.println("wrong operation name");
                    System.exit(0);
            }
            System.out.println(result);
        }
    }
}


