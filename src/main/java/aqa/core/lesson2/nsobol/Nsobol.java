package main.java.aqa.core.lesson2.nsobol;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// task № 1
public class Nsobol {
    public static void main(String[] args) {
    System.out.println("Hello human!");


        // task № 2
        byte a1;
        short k1;
        int d1;
        long r1;
        float t1;
        double p1;
        char f1;
        boolean g1;


        //task № 3
        a1 = 100;
        k1 = 4100;
        d1 = 5647;
        r1 = 15245845L;
        t1 = 14.458F;
        p1 = 33.045;
        f1 = 'a';
        g1 = false;

        //Task 4
        System.out.println("a1 =" + a1);
        System.out.println("a1 =" + k1);
        System.out.println("a1 =" + d1);
        System.out.println("a1 =" + r1);
        System.out.println("a1 =" + t1);
        System.out.println("a1 =" + p1);
        System.out.println("a1 =" + f1);
        System.out.println("a1 =" + g1);

        //Task 5

        int x=10;
        int y=14;

         System.out.println(x + y);

         //Task 6

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer:");
        int input = Integer.parseInt(br.readLine());
        System.out.println("Value that more than two times =" +(input*2));

        //Task 7

        System.out.println("14/209 + 14 * (29-13*13 + 14/3) = "+(14./209 + 14 * (29-13*13 + 14/3)));

        // Task 8
        System.out.println("((5 + (2 * 3 * 3))/√(7*4*4/(5 + 2*2)) = "+((5 + 2*3*3)/ Math.sqrt((7 * 4 * 4/5 +(2*2) ))) ) );


    }


}
