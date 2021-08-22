package aqa.core.lesson3.alun;
//simple console calculalator
import java.util.Scanner;
public class hw32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter q or Q for exit. To continue press another button: ");
        char quit = in.next().charAt(0);
        if (quit == 'Q' || quit == 'q') {
            System.exit(0);}
        else System.out.print("Input the first number : ");
        int num1 = in.nextInt();
        System.out.print("Your operation + - / * : ");
        char operator = in.next().charAt(0);
        System.out.print("Input the second number: ");
        int num2 = in.nextInt();
        double result = 0;
        switch (operator) {
            case '/':
                if (num2 == 0) {
                    System.out.print("Division By Zero! ");
                    break;
                }
                else result = ((double) num1) / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            default:
                System.out.println("Error operator");
        }
        if ((num2 == 0) && (operator == '/')) {System.out.print("Error division!");}
        else System.out.print("The result is "+result);
        in.close();
    }
}
