//package aqa.core.lesson2.tymofiiuk;
package aqa.core.lesson2.Tymofiiuk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask2 {
    public static void main(String[] args) throws IOException {
        //task 1
        System.out.println("Task 1:");
        System.out.println("Hello, Human");

        //task 2, 3
        byte b1 = 127;
        short s2 = 0b1001;
        int i3 = 0x2f;
        long k4 = 127L;
        float f5 = 25.456F;
        double d6 = 56.234;
        char c7 = 'a';
        boolean b8 = true;

        //task 4
        System.out.println();
        System.out.println("Task 4:");
        System.out.println(b1);
        System.out.println(s2);
        System.out.println(i3);
        System.out.println(k4);
        System.out.println(f5);
        System.out.println(d6);
        System.out.println(c7);
        System.out.println(b8);

        //task 5
        System.out.println();
        System.out.println("Task 5:");
        System.out.println(15 + 992);

        //task 6
        System.out.println();
        System.out.println("Task 6:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer:");
        int i = Integer.parseInt(br.readLine());
        System.out.println(i * 2);

        //task 7
        System.out.println();
        System.out.println("Task 7:");
        System.out.println(14.0 / 209.0 + 14.0 * (29.0 - 13.0 * 13.0 + 14.0 / 3.0));

        //task 8
        System.out.println();
        System.out.println("Task 8:");
        System.out.println((5.0 + 2.0 * 3.0 * 3.0) / (Math.sqrt(7.0 * (4.0 * 4.0 / (5.0 + 2.0 + 2.0)))));
    }
}