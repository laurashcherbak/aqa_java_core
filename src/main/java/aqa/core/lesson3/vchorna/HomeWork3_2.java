package aqa.core.lesson3.vchorna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork3_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String firstString = reader.readLine();

            if (firstString.equals("q")) {
                break;
            }

            double first = Double.parseDouble(firstString);
            String operation = reader.readLine();
            double second = Double.parseDouble(reader.readLine());
            switch (operation) {
                case "+":
                    System.out.println(first + second);
                    break;
                case "-":
                    System.out.println(first - second);
                    break;
                case "*":
                    System.out.println(first * second);
                    break;
                case "/":
                    System.out.println(first / second);
                    break;
                default:
                    System.out.println("I do not know such operator");
            }
        }
    }

}
