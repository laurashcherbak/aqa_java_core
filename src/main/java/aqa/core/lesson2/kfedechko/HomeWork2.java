package aqa.core.lesson2.kfedechko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2 {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello human!");

        byte bt = 2;
        short st = 7;
        int it = 28;
        long lg = 345;
        float ft = 5.456f;
        double dl = 87.6;
        char cr = 65;
        boolean bl = true;

        System.out.println("byte = " + bt + "\nshort = " + st + "\nint = " + it + "\nlong = " + lg + "\nfloat = " + ft
                + "\ndouble = " + dl + "\nchar = " + cr + "\nboolean = " + bl);

        System.out.println("2 digit sum = " + (5 + 15));


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer:");
        int i = Integer.parseInt(br.readLine());
        System.out.println(i*2);

        System.out.println(14/209 + 14 * (29 - Math.pow(13, 2) + 14/3));

        System.out.println((5 + 2 * Math.pow(3, 2))/Math.sqrt(7*(Math.pow(4, 2)/(5 + 2 * 2))));
    }

}