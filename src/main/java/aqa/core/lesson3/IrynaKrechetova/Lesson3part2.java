package aqa.core.lesson3.IrynaKrechetova;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson3part2 {
    public static void main(String[] args) throws IOException {
       do {
           BufferedReader Calculator = new BufferedReader(new InputStreamReader(System.in));
           System.out.println("Enter number1:");
           int x1 = Integer.parseInt(Calculator.readLine());

           System.out.println("Enter operation sign +, -, *, /.");
           char y = Calculator.readLine().charAt(0);

           System.out.println("Enter number2");
           int x2 = Integer.parseInt(Calculator.readLine());

           int result = 0;

           if (y == '+')
               result = x1 + x2;
           if (y == '-')
               result = x1 - x2;
           if (y == '*')
               result = x1 * x2;
           if (y == '/')
               result = x1 / x2;


           System.out.println("Result");
           System.out.println(result);

           System.out.println("Press any key to restart or press 'q' to finish");
           char z = Calculator.readLine().charAt(0);
           if (z == 'q')
               break;

       } while (true);


    }
}
