package main.java.aqa.core.lesson2.vriaboshapka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework2 {


    public static void main(String[] args) throws IOException {
        byte b1 = 2;
        short s2 = 4;
        int i3 = 9;
        long k4 = 330000;
        float f5 = 9.665689F;
        double d6 = 430.12345;
        char c7 = 'v';
        boolean b8 = true;
        String s = "Hello human!";

        System.out.println(s);
        System.out.println("byte: "+b1);
        System.out.println("short: "+s2);
        System.out.println("int: "+i3);
        System.out.println("long: "+k4);
        System.out.println("float: "+f5);
        System.out.println("double: "+d6);
        System.out.println("char: "+c7);
        System.out.println("boolean: "+b8);
        sumOfTwoDigits(3,4);
        printDoubleInteger();
        double calculation=(14.0/209.0)+(14.0*(29.0-Math.pow(13,2)+(14.0/3.0)));
        System.out.println("task 7 result: "+calculation);
        calculation=(5.0+(2.0*Math.pow(3,2)))/Math.sqrt(7.0*Math.pow(4,2)/(5.0+2.0*2.0));
        System.out.println("task 8 result: "+calculation);

     }


    public static void sumOfTwoDigits(int a,int b){
        int result = a+b;
        System.out.println("sum of two digits= "+result);
    }
    public static void printDoubleInteger() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // stream opening
        System.out.println("Enter Integer:");
        int i = Integer.parseInt(br.readLine()); // stream reading
        i*=2;
        System.out.println("double integer= "+i);
    }


}
