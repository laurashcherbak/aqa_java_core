package aqa.core.lesson2.YuraKramarevych;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork2 {

    public static void main(String[] args) throws IOException {
         System.out.println("Hello Human!");

         byte b1 = 10;
         short s2 = 5;
         int i3 = 1;
         long l4 = 10511051;
         float f5 = 105F;
         double d6 = 1.5;
         char c7 = 'k';
         boolean b8 = true;

         System.out.println("byte:" + b1);
         System.out.println("short:" + s2);
         System.out.println("int:" + i3);
         System.out.println("long:" + l4);
         System.out.println("Float:" + f5);
         System.out.println("doubl:" + d6);
         System.out.println("char:" + c7);
         System.out.println("boolean:" + b8);

         System.out.println("Sum:" + (b1+i3));

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter Integer:");
         int i = Integer.parseInt(br.readLine());
         System.out.println(i*2);

         System.out.println(14F/209+14*(29-Math.pow(13,2)+14F/3));

         System.out.println((5+2*Math.pow(3,2))/Math.sqrt(7*Math.pow(4, 2)/(5+2*2)));




    }

}
