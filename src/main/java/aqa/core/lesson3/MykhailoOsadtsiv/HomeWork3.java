package aqa.core.lesson3.MykhailoOsadtsiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HomeWork3 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }

        char q = '~';
        while (q != 'q') {
       // Scanner scan = new Scanner(System.in);
        Double a = null, b = null;
        char c = '~';
            a = getDouble();
            c = getOperand();
            b = getDouble();
            double r = calc(a,b,c);
            System.out.println("result is: " + r);
            System.out.println(" Do you want to use calculator once more? q for exit, any other input to repeat");
            q = scan.next(".").charAt(0);
        }
    }

    public static Double getDouble(){
        System.out.println("Write operand value:");
        Double d;
        if(scan.hasNextDouble()){
            d = scan.nextDouble();
        } else {
            System.out.println("That not a double value!");
            scan.next();//recursion
            d = getDouble();
        }
        return d;
    }

    public static char getOperand() {
        System.out.println("Write one of operators value: + - * /");
        char operation;
        if(scan.hasNext()){
            operation = scan.next().charAt(0);
        } else {
            System.out.println("ERROR. Try Again");
            scan.next();//recursion
            operation = getOperand();
        }
        return operation;
    }

    public static double calc(double num1, double num2, char c) {
        double result;
        switch (c){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Bad operator. Repeat input.");
                result = calc(num1, num2, getOperand());//recursion
        }
        return result;
    }
}

