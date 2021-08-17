package aqa.core.lesson2.mbednarchuk;
import java.util.Scanner;
import java.lang.Math;


public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println(" Hello human!");

        byte b1 = 15;
        short s2 = -300;
        int i3 = 9;
        long k4 = 822337203685477L;
        float f5 = 11.2F;
        double d6 = 8.7;
        char c7 = 'a';
        boolean b8 = true;
        System.out.printf(" Byte: %d\n Short: %d\n Int: %d\n Long: %d\n Float: %f\n Double: %f\n Char: %s\n Boolean: %s \n", b1, s2, i3, k4, f5, d6, c7, b8);
        System.out.println(" Sum of 2 digits:" + (i3 + d6));
        assignScan();
        arithmeticOperations();
    }
        public static void assignScan() {
            Scanner in = new Scanner(System.in);
            System.out.print(" Input a number: ");
            int num = in.nextInt();

            System.out.printf(" Your number: %d \n", num * 2);
            in.close();
        }
    public static void arithmeticOperations() {
        int x = ((14/209) + (14 * (29 - (13^2) + (14 / 3))));
        int y = (int) (5+ (2 * Math.pow(3, 2)));
        System.out.println(" Result of arithmetic operation:"+  (x));
        System.out.println(" Result of arithmetic operation:"+  (y));
    }

}
