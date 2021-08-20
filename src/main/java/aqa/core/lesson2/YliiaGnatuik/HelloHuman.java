package aqa.core.lesson2.YliiaGnatuik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloHuman {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello Human");
        byte a = 8;
        short b = 6;
        int c = 4;
        long d = 9;
        float e = 5;
        double f = 2;
        char l = '3';
        boolean n = true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(l);
        System.out.println(n);
        System.out.println(b+c);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer:");
        int i = Integer.parseInt(br.readLine());
        System.out.println(i);
        System.out.println(i*2);
        float m = 14/209 + 14 * (29-13*13 + 14/3);
        System.out.println(m);
    }

}