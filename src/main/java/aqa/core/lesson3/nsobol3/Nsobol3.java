package aqa.core.lesson3.nsobol3;

import java.util.Scanner;

public class Nsobol3 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println("Iteration: " + i);
            }
            i++;
        }

        char shouldContinue;
        shouldContinue =' ';
       while (shouldContinue !='q'){
           System.out.println("Enter a number 1");
           Scanner scanner = new Scanner(System.in);
           double num1;
           num1 = scanner.nextDouble();
           System.out.println("Enter one of the arithmetic operations +, -, *, /");
           char sign;
           sign = scanner.next().charAt(0);
           System.out.println("Enter a number 2");
           double num2;
           num2 = scanner.nextDouble();
           double sum = 0;
           switch (sign) {
               case '+': {
                   sum = num1 + num2;
                   break;
               }
               case '-': {
                   sum = num1 - num2;
                   break;
               }
               case '*': {
                   sum = num1 * num2;
                   break;
               }
               case '/': {
                   sum = num1 / num2;
                   break;
               }
           }
           System.out.println(sum);
           System.out.println("Should we continue");
           shouldContinue = scanner.next().charAt(0);
       }
    }
}