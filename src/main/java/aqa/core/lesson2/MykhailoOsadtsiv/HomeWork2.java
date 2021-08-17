package aqa.core.lesson2.MykhailoOsadtsiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello human!");
        //
        byte b1 = 123;
        short s2 = 124;
        int i3 = 125;
        long l4 =126;
        float f5 = 127f;
        double d6 = 128;
        char c7 = 'ü';
        boolean b8 = false;
        //
        System.out.println(b1 + " " + s2 + " " + i3 + " " + l4 + " " + f5 + " " + d6 + " " +
                c7 + " " +b8);
        //
        System.out.println("sum of 2 digits" + ": i3+l4=" + (i3+l4));
        //
        System.out.println("Enter Integer:");
        BufferedReader brb = new BufferedReader(new InputStreamReader(System.in)); // stream opening
        int i = Integer.parseInt(brb.readLine()); // stream reading
        System.out.println(i * 2);
        //
        double p1 = 14;
        double p2 = 209;
        double p3 = 29;
        double p4 = 13;
        double p5 = 3;
        System.out.println("14/209 + 14 * (29-13² + 14/3)= " + (p1/p2 + (p1 * (p3-Math.pow(p4, 2))) + (p1/p5)));
        //
        double op1 = 2 * Math.pow(3, 2) + 5;
        double op2 = Math.sqrt((7 * Math.pow(4, 2)) / (2 * 2 + 5));
        System.out.println("Task8 result: " + op1 / op2);
    }

}
