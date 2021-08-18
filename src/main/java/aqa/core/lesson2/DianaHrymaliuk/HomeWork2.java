package aqa.core.lesson2.DianaHrymaliuk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.sqrt;

public class HomeWork2 {

//Всі таски окремо працюють
//    Task 1.
    public static void main(String[]arg) {
        System.out.println("Hello human!");
    }

////    Task 2-3.
    private static
        byte b1 = 25;
    private static
        short s2 = 0b1001;
    private static
        int i = 0x2f;
    private static
        long l = 2345678923456L;
    private static
        float f = 18.456F;
    private static
        double d = 77.234;
    private static
        char c1 = 'h';
    private static
        boolean bl = true;

//    //    Task 4.
    public static void main(String[] args) {
        assignOperators();
        System.out.println(b1);
        System.out.println(s2);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c1);
        System.out.println(bl);

////        Task 5.
        System.out.println(b1 + f);
    }

//    Task 6.

            public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Integer:");
            int i = Integer.parseInt(br.readLine());
            System.out.println(i * 2);
        }
    //    Task 7.
    public static void main(String[]arg) {
        assignOperators();
        double a = (14./209 + 14 * (29-13*13 + (14./3)));
        System.out.println(a);
    }

    //    Task 8.
    public static void main(String[] arg) {
        assignOperators();
        double a = (5 + 2*3*3)/sqrt(7.*4*4/(5 + 2*2));
        System.out.println(a);

    }

    private static void assignOperators() {
    }
}