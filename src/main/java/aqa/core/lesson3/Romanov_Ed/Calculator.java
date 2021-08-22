package aqa.core.lesson3.Romanov_Ed;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.scan();
        calculator.operation();
    }

    int num1, num2, result;

    public String scan() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Введи первое число:");
        num1 = inputScanner.nextInt();
        System.out.println("Введи второе число:");
        num2 = inputScanner.nextInt();
        System.out.println("Введите операцию для вычисления:");
        String operationType = inputScanner.next();
        return operationType;
    }

    public void operation() {
        if (scan().equals("*")) {
            result = num1 * num2;
            System.out.println("Твой результат =" + result);
        } else if (scan().equals("/")) {
            result = num1 / num2;
            System.out.println("Твой результат =" + result);
        } else if (scan().equals("+")) {
            result = num1 + num2;
            System.out.println("Твой результат =" + result);
        } else if (scan().equals("-")) {
            result = num1 - num2;
            System.out.println("Твой результат =" + result);
        } else {
            System.out.println("Введено некорректное значение");
        }
    }
}
