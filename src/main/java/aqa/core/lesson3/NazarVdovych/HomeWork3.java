package aqa.core.lesson3.NazarVdovych;

import java.util.Scanner;

public class HomeWork3 {
    //Task 1
    /*
     public static void main(String[] args) {
         int k;
            for(k = 0; k <= 20; k++){
            if (k % 2 != 0) {
                System.out.print(k + "\n");
            }

         }
         System.out.print("Програма вивела не парні числа від 0 до 20"+"\n");
    }

     */

    //Task 2


    public static void main(String[] args) {
        double First1;
        double Second2;
        double result;
        char operator;




        Scanner reader = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        First1 = reader.nextDouble();//Вводим перше число

        System.out.print("\n Виберіть оператор (+, -, *, /): ");
        operator = reader.next().charAt(0);//Далі буде оператор вибираєм

        System.out.print("\nВведіть друге число: ");
        Second2 = reader.nextDouble();//вводим друге число



        //operator = reader.next().charAt(0);

        switch (operator) {
            case '+':
                result = First1 + Second2;
                break;
            case '-':
                result = First1 - Second2;
                break;
            case '*':
                result = First1 * Second2;
                break;
            case '/':
                result = First1 / Second2;
                break;
            default:
                System.out.printf("Ви вибрали неправильний оператор!");
                return;
        }
        // System.out.print("");
        System.out.printf(First1 + " " + operator + " " + Second2 + " = " + result);
    }
}


