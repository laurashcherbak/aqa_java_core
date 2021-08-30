package aqa.core.lesson3.heleshko;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 20) {
            System.out.println("Iteration: " + i);
            i += 2;
        }
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first value: ");
            String value = sc.nextLine();
            if (value.equals("q")) {
                return;
            } else {
                double number1 = Double.parseDouble(value);
                Homework3.launchCalculator(sc, number1);
            }
        }
    }

    public static void launchCalculator(Scanner sc, double number1) {
        System.out.println("Enter operation: ");

        char operator = sc.next().charAt(0);
        System.out.println("Enter second value: ");
        double number2 = sc.nextDouble();
        double result = 0.0;

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;
            case '/':
                result = number1 / number2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}

