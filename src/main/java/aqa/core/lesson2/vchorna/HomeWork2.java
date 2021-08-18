package aqa.core.lesson2.vchorna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2 {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello human!");

        byte byteVariable = 127;
        short shortVariable = 0b1101;
        int intVariable = 0x9f;
        long longVariable = 876543854536575L;
        float floatVariable = 12.675F;
        double doubleVariable = 32.423;
        char charVariable = 'b';
        boolean booleanVariable = false;

        System.out.println("byte: " + byteVariable);
        System.out.println("short: " + shortVariable);
        System.out.println("int: " + intVariable);
        System.out.println("long: " + longVariable);
        System.out.println("float: " + floatVariable);
        System.out.println("double: " + doubleVariable);
        System.out.println("char: " + charVariable);
        System.out.println("boolean: " + booleanVariable);

        System.out.println(byteVariable + doubleVariable);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer:");
        int i = Integer.parseInt(br.readLine());
        System.out.println(i * 2);

        System.out.println(14.0 / 209 + 14 * (29 - Math.pow(13, 2) + 14.0 / 3));

        System.out.println((5 + 2 * Math.pow(3, 2)) / Math.sqrt(7 * Math.pow(4, 2) / (5 + 2 * 2)));
    }

}
