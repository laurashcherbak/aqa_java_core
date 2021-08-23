package aqa.core.lesson3.YliiaGnatuik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork32 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Enter first number:");
            String firstInput = br.readLine();
            if (firstInput.equals("q")) {
                System.exit(0);
            }
            int i = Integer.parseInt(firstInput);
            System.out.println("Enter operation");
            String operation = br.readLine();
            if (operation.equals("q")) {
                System.exit(0);
            }
            System.out.println("Enter second number:");
            String secondInput = br.readLine();
            if (secondInput.equals("q")) {
                System.exit(0);
            }
            int y = Integer.parseInt(secondInput);
            switch (operation) {
                case "/":
                    System.out.println(i / y);
                    break;
                case "+":
                    System.out.println(i + y);
                    break;
                case "-":
                    System.out.println(i - y);
                    break;
                case "*":
                    System.out.println(i * y);
                    break;
            }
        }



    }

}
