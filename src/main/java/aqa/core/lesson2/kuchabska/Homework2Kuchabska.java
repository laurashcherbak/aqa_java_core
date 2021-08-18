package main.java.aqa.core.lesson2.kuchabska;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework2Kuchabska {
    public static void main(String[] args) throws IOException {
        // 1
        System.out.println("Hello human!");

        //2
        byte val1;
        short val2;
        int val3;
        long val4;
        float val5;
        double val6;
        char val7;
        boolean val8;

        //3
        val1 = 10;
        val2 = 20;
        val3 = 30;
        val4 = 40;
        val5 = 50;
        val6 = 60.55;
        val7 = 100;
        val8 = false;

        //4
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
        System.out.println(val6);
        System.out.println(val7);

        //5.
        System.out.println(val3+val4);

        //6
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer:");
        int i = Integer.parseInt(br.readLine());
        System.out.println(2 * i);

        //7
        double result = 14.0 / 209.0 + 14 * ((29 - Math.pow(13,2)) + (14.0 / 3.0));
        System.out.println(result);

        //8
        double result2 = (5 + (2 * Math.pow(3,2))) / (Math.sqrt(7 * ((Math.pow(4,2) / (5 + (2 * 2))))));
        System.out.println(result2);
    }
}
