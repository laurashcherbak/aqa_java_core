package aqa.core.lesson3.KostiantynStavruk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson3 {
    public static void main(String[] args) {
        task_1();
        task_2();
    }

    public static void task_1() {
        System.out.println("-----TASK_1-----");
        System.out.println("#Metod_ONE print odd numbers through loop");
        for (int i = 0; i++ < 20; i += 1) {
            System.out.println(i);
        }
        System.out.println("\n#Metod_TWO print odd numbers through module");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static void task_2() {
        System.out.println("\n-----TASK_2-----");
        System.out.println("---------------------CALCULATOR STARTS--->");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double first = 0;
        double second = 0;
        String action = null;
        while (true) {
            try {
                System.out.println("Enter a number:");
                first = Double.parseDouble(br.readLine());
                System.out.println("Sign of one arithmetic operations +, -, *, / :");
                action = br.readLine();
                System.out.println("Enter a number:");
                second = Double.parseDouble(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Result:");
            if (action.equals("+")) {
                System.out.println(first + second);
            }
            if (action.equals("-")) {
                System.out.println(first - second);
            }
            if (action.equals("*")) {
                System.out.println(first * second);
            }
            if (action.equals("/")) {
                System.out.println(first / second);
            }
            try {
                System.out.println("IF YOU WANT EX_IT ENTER 'q' OR ENTER ANY SYMBOL TO CONTINUE");
                action = br.readLine();
                if (action.equals("q")) {
                    System.exit(0);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

