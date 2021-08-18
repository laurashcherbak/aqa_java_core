package main.java.aqa.core.lesson3.kuchabska;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class homework3_kuchabska {

    public static void main(String[] args) throws IOException {
        //1
        int range = 20;
        for (int i = 0; i <= range; i++) {
            if (i % 2 == 0)  {
                System.out.print("Even: ");
                System.out.println(i);
            } else {
                System.out.print("Odd: ");
                System.out.println(i);
            }
        }

        //2
        System.out.println();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter 1 number:");
            int firstNum = Integer.parseInt(br.readLine());
            System.out.println("Enter operation +, -, *, /");
            String operation = br.readLine();
            if (Objects.equals(operation, "q")) {
                System.out.println("Finish program by user");
                System.exit(0);
            }
            System.out.println("Enter 2 number:");
            int secondNum = Integer.parseInt(br.readLine());
            switch (operation) {
                case "+":
                    System.out.print("Result: ");
                    System.out.println(firstNum + secondNum);
                    break;
                case "-":
                    System.out.print("Result: ");
                    System.out.println(firstNum - secondNum);
                    break;
                case "*":
                    System.out.print("Result: ");
                    System.out.println(firstNum * secondNum);
                    break;
                case "/":
                    if (secondNum != 0) {
                        System.out.print("Result: ");
                        System.out.println(firstNum / secondNum);
                    } else {
                        System.out.println("Divide by zero not allowed");
                    }
                    break;
                default:
                    System.out.println("Operation not recognized");

            }

        }
    }
}
