package aqa.core.lesson3.KvitoslavaSikyrynska;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("Друкуються парні числа на проміжку від 0 до 20.");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        Scanner scan = new Scanner(System.in);
        int val1, val2, result;
        char operator, val3;
        while (true) {
            System.out.println("Enter first number: ");
            val1 = scan.nextInt();
            System.out.println("Enter an operator: ");
            operator = scan.next(".").charAt(0);
            System.out.println("Enter second number:");
            val2 = scan.nextInt();
            System.out.println("result is: ");

            switch (operator){
                case '+':
                    result = val1+val2;
                    System.out.println(result);
                    break;
                case '-':
                    result = val1-val2;
                    System.out.println(result);
                    break;
                case '*':
                    result = val1*val2;
                    System.out.println(result);
                    break;
                case '/':
                    result = val1/val2;
                    System.out.println(result);
                    break;
                default:
                    System.out.println("Операция не распознана. Повторите ввод.");
            }
            System.out.println("Enter 'q' for exit");
            val3 = scan.next(".").charAt(0);

        }
    }
}


