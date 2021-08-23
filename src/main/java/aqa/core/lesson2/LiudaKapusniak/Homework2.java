package aqa.core.lesson2.LiudaKapusniak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework2 {
            //Task 1
     public static void main(String[] args) throws IOException {
         System.out.println("Hello Human");

            //Task 2

             byte b1;
             short s2;
             int i3;
             long l4;
             float f5;
             double d6;
             char ch7;
             boolean b8;
             String ss10;

             //Task 3

             b1 = 10;
             s2 = 250;
             i3 = 400;
             l4 = 1112223334445L;
             f5 = 4.99f;
             d6 = 29.98d;
             ch7 = 'A';
             b8 = true;
             ss10 = "Hello Human";

             //Task 4

             System.out.println("b1 = " +b1);
             System.out.println("s2 = " +s2);
             System.out.println("i3 = " +i3);
             System.out.println("l4 = " +l4);
             System.out.println("f5 = " +f5);
             System.out.println("d6 = " +d6);
             System.out.println("ch7 = " +ch7);
             System.out.println(true);
             System.out.println("ss10 = " +ss10);

             //Task 5

             int x = 10;
             int y = 20;
             System.out.println(x + y);

             //Task 6

             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter Integer:");
             int input = Integer.parseInt(br.readLine());
             System.out.println("input =" +(input*2));

             //Task 7

             int z = 14;
             float g = 14/209f;
             int h = 29-13*13;
             float j = z/3f;
             float k = g + z*(h+j);
             System.out.println("k = " +k);


             //Task 8

             int p = 5;
             int t = 2;
             int u = p + t*(3*3);
             int v = (p + t)*(4*4);
             int w = p + t*t;
             int r = v/w;
             double q = Math.sqrt(r);
             double e = u/q;
             System.out.println("e = " +e);



         }
     }
