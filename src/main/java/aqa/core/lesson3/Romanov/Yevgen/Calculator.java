package aqa.core.lesson3.Romanov.Yevgen;

import java.util.Scanner;

public class Calculator {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println(a + "первое число");
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int c = a - b;
        System.out.println("ответ:" + c);
        if (c == b) {
            System.out.println("Ошибка!");
        }
    }
}
