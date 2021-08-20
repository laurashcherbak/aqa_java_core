package aqa.core.lesson2.Vlasiuk;

import java.io.BufferedReader;
import static java.lang.Math.sqrt;
import java.io.IOException;
import java.io.InputStreamReader;


public class VlasiukOksana {
    public static void main(String[] args) throws IOException {
        // 1, 2, 3, 4 tasks
        System.out.println("Hello human!");
        byte byteB = 8;
        short shortS = 1;
        int numInt = 3;
        long longL = 333346743;
        float floatF = 3.233F;
        double numDouble = 3.33;
        char charC = 's';
        boolean bl = false;

        System.out.println(byteB);
        System.out.println(shortS);
        System.out.println(numInt);
        System.out.println(longL);
        System.out.println(floatF);
        System.out.println(numDouble);
        System.out.println(charC);
        System.out.println(bl);


        // task  5
        System.out.println(" Sum of 2 digits:" + (numInt + numDouble));

        // task 6
        System.out.print("Enter number value : ");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(buffer.readLine());
        System.out.println("value that is 2 times more than input = " + (i * 2));

        // task 7
        System.out.println("calculate task 7: result - " + ((14 / 209) + (14 * ((29 - (13 ^ 2)) + (14 / 3)))));

        // task 8
        System.out.println("calculate task 8: result - " + 5 + 2 * (3 ^ 2) / sqrt(7 * (4 ^ 2) / (5 + 2 * 2)));

    }
}
