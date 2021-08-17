package aqa.core.lesson2.RomanovYevgen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Hello human");
    }




    public class DataTypes {
        public static void main(String[] args) throws IOException {
            String my_name;
            byte var_byte;
            int var_int;
            char var_char;
            long var_long;
            double var_double;
            short var_short;
            float var_float;
            boolean var_boolean;


            //comment
            my_name = "Romanov";
            var_byte = 107;
            var_int = 267638291;
            var_double = 45.36;
            var_char = 'y';
            var_boolean = true;
            var_float = 21.765F;
            var_long = 12345678900L;
            var_short = 8768;


            // Displayed------------

            System.out.println("Value byte" + var_byte);
            System.out.println("Value char" + var_char);
            System.out.println("Value int" + var_int);
            System.out.println("Value float" + var_float);
            System.out.println("Value double" + var_double);
            System.out.println("Value boolean" + var_boolean);
            System.out.println("Value long" + var_long);
            System.out.println("Value short" + var_short);
            System.out.println("My name is" + my_name);

            //Displayed
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter first number:");
            double first_number = Integer.parseInt(reader.readLine());
            System.out.println("Enter second number:");
            double second_number = Integer.parseInt(reader.readLine());
            double s = sum(first_number, second_number);
            System.out.println("Sum = (" + s + ")\n");


            //Displayed
            System.out.println("Enter number and program will double the number:");
            int number = Integer.parseInt(reader.readLine());
            System.out.println("Sum = " + (number *= 2));

            //calculate

            calculate_expression();

            //Displayed
            System.out.println("Result = " + ((5 + 2 * Math.pow(3, 2) / Math.sqrt((7 * Math.pow(4, 2) / 5 + 2 * 2)))));
        }
            public void printHello(){

                System.out.println("Hello Human!");
            }
            public static double sum (double x1,double x2)
            {
                double s = 0;
                s = x1 + x2;
                return s;

            }

            public static void calculate_expression(){

                double expression_result = 14/209 + 14 * (Math.pow((29-13),2) + 14/3);
                System.out.println("Expression result:" + expression_result);

            }



        }

    }



