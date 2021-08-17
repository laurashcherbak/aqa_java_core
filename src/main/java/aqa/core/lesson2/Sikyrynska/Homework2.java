package aqa.core.lesson2.Sikyrynska;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Task 1
public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Hello human!");
    }


    //Task 2
    byte b1;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean b2;

    //Task 3
    b1 =21;
    s =0b1001;
    i =0x2f;
    l =2884849300973728283L;
    f =18.456F;
    d =12.749;
    c ='q';
    b2 =false;

    //Task 4
    System.out.printf(b1,"\n");
    System.out.printf(s,"\n");
    System.out.printf(i,"\n");
    System.out.printf(l,"\n");
    System.out.printf(f,"\n");
    System.out.printf(d,"\n");
    System.out.printf(c,"\n");
    System.out.printf(b2,"\n");


    //Task 5
    System.out.println(b1 +d);


    //Task 6
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter Integer:");
    int number = Integer.parseInt(br.readLine());
    System.out.println(number *2);


    //Task 7
    double d1 = (14.0 / 209.0) + 14 * ((29 - 13 * 13) + (14.0 / 3.0));
        System.out.println(d1);


    //Task 8
    double d2 = (5 + (2 * 3 * 3)) / (Math.sqrt(7 * ((4 * 4) / (5 + (2 * 2)))));
    System.out.println(d2);


}