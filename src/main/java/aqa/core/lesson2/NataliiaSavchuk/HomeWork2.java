package aqa.core.lesson2.NataliiaSavchuk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2 {

    public static void main(String[] args)throws IOException
    {
        //Part 1
        byte var_byte;
        short var_short;
        int var_int;
        long var_long;
        float var_float;
        double var_double;
        char var_char;
        boolean var_boolean;
        String my_name;

        //Part 2
        var_byte = 110;
        var_short = 9385;
        var_int = 84744555;
        var_long = 7459373566947984L;
        var_float = 13.485F;
        var_double = 56.56;
        var_char = 'n';
        var_boolean = true;
        my_name = "Natalia";

        System.out.println("-----------------------Part 3-----------------------------------------");
        //Part 3
        System.out.println("Value byte: " + var_byte);
        System.out.println("Value short: " + var_short);
        System.out.println("Value int: " + var_int);
        System.out.println("Value long: " + var_long);
        System.out.println("Value float: " + var_float);
        System.out.println("Value double: " + var_double);
        System.out.println("Value char: " + var_char);
        System.out.println("Value boolean: " + var_boolean);
        System.out.println("My name is " + my_name);

        System.out.println("------------------------Part 4----------------------------------------");
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        //Part 4
        System.out.println("Enter first number:");
        double first_number = Integer.parseInt(reader.readLine());
        System.out.println("Enter second number:");
        double second_number = Integer.parseInt(reader.readLine());
        double s = sum(first_number,second_number);
        System.out.println("Sum = " + s +")\n");

        System.out.println("----------------------Part 5------------------------------------------");
        //Part 5
        System.out.println("Enter number and the program will double the number: ");
        int number = Integer.parseInt(reader.readLine());
        System.out.println("Sum = " + (number*=2));

        System.out.println("-------------------------Part 6--------------------------------------");
        //Part 6
        calculate_expression();

        System.out.println("---------------------------Part 7-------------------------------------");
        //Part 7
        System.out.println("Result = " + ((5+2* Math.pow(3,2)/Math.sqrt((7*Math.pow(4,2)/5+2*2)))));
    }
    public void printHello()
    {
        System.out.println("Hello human!");
    }

    public static double sum (double x1,double x2)
    {
        double s = 0;
        s = x1 + x2;
        return s;
    }

    public static void calculate_expression()
    {
        double expression_result = 14/209 + 14 * (Math.pow((29-13),2) + 14/3);
        System.out.println("Expression result: "+ expression_result);
    }
}
