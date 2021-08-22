package aqa.core.lesson2.DianaHrymaliuk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.sqrt;

public class HomeWork2 {


//    Task 1.
    public static void main(String[] args) throws IOException {
        System.out.println("Hello human!");

////    Task 2-3.

        byte b = 25;
        short s2 = 0b1001;
        int i = 0x2f;
        long l = 2345678923456L;
        float f = 18.456F;
        double d = 77.234;
        char c1 = 'h';
        boolean bl = true;

//    //    Task 4.
        System.out.print(b + "\n");
        System.out.print(s2 + "\n");
        System.out.print(i + "\n");
        System.out.print(l + "\n");
        System.out.print(f + "\n");
        System.out.print(d + "\n");
        System.out.print(c1 + "\n");
        System.out.print(bl + "\n");

////        Task 5.
        System.out.print(b + f + "\n");


//    Task 6.


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Integer:");
            int i1 = Integer.parseInt(br.readLine());
            System.out.println(i1 * 2);

    //    Task 7.

        double a1 = (14./209 + 14 * (29-13*13 + (14./3)));
        System.out.println(a1);

    //    Task 8.

        double a2 = (5 + 2*3*3)/sqrt(7.*4*4/(5 + 2*2));
        System.out.println(a2);

    }
}