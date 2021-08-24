package aqa.core.lesson3.NataliaSkrypak;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] arg){

        //Task 1

        for (int i = 1; i < 20; i++){
            if(i % 2 != 1) {
                System.out.println(i);
            }

        }

        //Task 2

        System.out.println ("Please perform an action: ");
        Scanner calc = new Scanner(System.in);
        int num1 = calc.nextInt();
        int num2 = calc.nextInt();
        System.out.println("Please enter an operation: ");
        Scanner op = new Scanner(System.in);
        String operation = op.next();

        if (operation.equals("+")) {
            System.out.println(num1 + num2);
        }else if(operation.equals("-")) {
            System.out.println(num1 - num2);
        }else if (operation.equals("/")) {
            if(num2 == 0) {
                System.out.println("Division is forbidden!");
            }else {
                System.out.println(num1 / num2);
            }
        }else if(operation.equals("*")) {
            System.out.println(num1 * num2);
        }else if(operation.equals("q")) {
            System.exit(0);
        }else{
            System.out.println("Please enter number!");
        }
        System.out.println("Please try again!");
    }
}
