package aqa.core.lesson3.yumykhalchuk;
/*    1.	Write a calculator.
        Stages:
        1 - prompt the user to enter a number
        2 - then the sign of one of the arithmetic operations +, -, *, /.
        3 - enter another number
        4 - perform the operation, print the result, and offer to enter a new one
        5 - If the user enters q, then stop the program.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            System.out.println("Please, enter your first number: ");
            int firstN = Integer.parseInt(reader.readLine());
            System.out.println("Please, chose one of the arithmetic operations +, -, *, / : ");
            String op = reader.readLine();
            System.out.println("Please, enter your second number: ");
            int sum;
            int sub;
            int pr;
            int div;
            int secondN = Integer.parseInt(reader.readLine());
            // Only for java >=14 but we use 8
//            switch (op) {
//                case "+" -> {
//                    sum = firstN + secondN;
//                    System.out.println("Sum of first and second number is: " + " " + sum);
//                }
//                case "-" -> {
//                    sub = firstN - secondN;
//                    System.out.println("Sub of first and second number is: " + " " + sub);
//                }
//                case "*" -> {
//                    pr = firstN * secondN;
//                    System.out.println("Product of first and second number is: " + " " + pr);
//                }
//                case "/" -> {
//                    div = firstN / secondN;
//                    System.out.println("Division of first and second number is: " + " " + div);
//                }
//                default -> System.out.println("I don't know what I want to do");
//            }
//            System.out.println("Do you want to continue your calculation? If not - enter q, if yes - enter other symbol");
//            String ex = reader.readLine();
//            if(ex.equals("q")){
//                break;
//                //System.exit(9);
//            }
        }

    }
}
