package aqa.core.lesson3.LuibovPylypenko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTasks3 {

    public static void main(String[] args) throws IOException {

        System.out.println("Task1 1");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Task 2");
        double d1, d2, res;
        String inputLine = "";
        char action = ' ';

        while (true) {

            try {
                System.out.println(" Do you want to use calculator again? q for exit, any other input to input digit or action");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Input digit 1 :  ");
                inputLine = br.readLine();
                if (inputLine.charAt(0) == 'q') {
                    System.exit(0);
                }
                d1 = Double.parseDouble(inputLine);

                System.out.println("Input operation symbol : + - * /");
                inputLine = br.readLine();
                action = inputLine.charAt(0);
                if (action == 'q') {
                    System.exit(0);
                }

                System.out.println("Input digit 2 : ");
                inputLine = br.readLine();
                if (inputLine.charAt(0) == 'q') {
                    System.exit(0);
                }
                d2 = Double.parseDouble(inputLine);

                switch (action) {
                    case '+':
                        res = d1 + d2;
                        System.out.println("Result: " + res);
                        break;
                    case '-':
                        res = d1 - d2;
                        System.out.println("Result: " + res);
                        break;
                    case '*':
                        res = d1 * d2;
                        System.out.println("Result: " + res);
                        break;
                    case '/':
                        if (d2 == 0) {
                            System.out.println("Can not divide by 0");
                        }
                        res = d1 / d2;
                        System.out.println("Result: " + res);
                        break;
                    default:
                        System.out.println("You have written wrong or not supported action!");
                        break;
                }
            }
            catch (NumberFormatException e) {
                System.out.println("You entered non-digit value!");
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
