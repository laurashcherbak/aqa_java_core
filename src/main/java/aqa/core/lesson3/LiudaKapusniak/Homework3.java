package aqa.core.lesson3.LiudaKapusniak;

import java.io.IOException;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) throws IOException {

        //Task 1
        int range = 20;
        for (int a = 0; a <= range; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }

        //Task 2
        double x1;
        double x2;
        double r;
        char k;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        x1 = reader.nextDouble();
        x2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+,-,*,/): ");
        k = reader.next().charAt(0);
        switch (k) {
            case '+': r = x1 + x2;
            break;
            case '-': r = x1 - x2;
            break;
            case '*': r = x1 * x2;
            break;
            case '/': r = x1 / x2;
            break;
            default: System.out.printf("Error! Enter correct operator");
            return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.printf(x1 + "" + k + "" + x2 + "=" + r);



        }


}
