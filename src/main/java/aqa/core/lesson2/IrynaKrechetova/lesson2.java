package aqa.core.lesson2.IrynaKrechetova;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lesson2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello human!");

        byte x1 = 0;
        short x2 = 0;
        int x3 = 0;
        long x4 = 0L;
        float x5 = 0.0F;
        double x6 = 0.0;
        char x7 = 'x';
        boolean x8 = true;

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
        System.out.println(x6);
        System.out.println(x7);
        System.out.println(x8);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer:");
        int x9 = Integer.parseInt(br.readLine());
        x9 = x9 * 2;
        System.out.println(x9);

        int x10 = 2 + 2;
        System.out.println(x10);

        double x11 = 14 / 209F + 14 * (29 - (Math.pow(13, 2)) + 14/3F);
        System.out.println(x11);

        double x12 = (5 + 2*(Math.pow(3, 2))) / (Math.sqrt(7 * ((Math.pow(4, 2)) / (5 + 2*2))));
        System.out.println(x12);
    }

}

