package aqa.core.lesson2.KostiantynStavruk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson2 {
    public static void main(String[] args) {
        System.out.println("-----------START-----------");
        System.out.println("Hello human!");
        System.out.println("----------------------------");
        task_2_3_4();
        System.out.println("----------------------------");
        System.out.println("sum = " + (999 + 2));
        System.out.println("----------------------------");
        task_6();
        System.out.println("----------------------------");
        task_7();
        System.out.println("----------------------------");
        task_8();
        System.out.println("------------END-------------");
    }

    public static void task_2_3_4() {
        byte b;
        short sh;
        int i;
        long l;
        float fl = 1.3F;
        double d = 2.314;
        char ch = 'W';
        boolean bl = true;
        b = 100;
        sh = 999;
        i = 1001;
        l = 90190190901901L;
        System.out.println("byte = " + b
                + "\nshort = " + sh
                + "\nint = " + i
                + "\nlong = " + l
                + "\nfloat = " + fl
                + "\ndouble = " + d
                + "\nchar = " + ch
                + "\nboolean = " + bl);
    }

    public static void task_6() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer:");
        try {
            int i = Integer.parseInt(br.readLine());
            System.out.println(i + " x 2 = " + (i * 2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task_7() {
        double result1 = (double) ((double) 14 / 209 + 14 * (29 - Math.pow(13, 2) + (double) 14 / 3));
        System.out.println("result_1 = " + result1);
    }

    public static void task_8() {
        double x = 2, y = 3, z = 4, k = 5, q = 7;
        double result2 = (k + x * Math.pow(y, 2)) / (Math.sqrt(q * (Math.pow(z, 2) / (k + x * x))));
        System.out.println("result_2 = " + result2);
    }

}

