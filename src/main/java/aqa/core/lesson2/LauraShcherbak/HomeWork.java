package aqa.core.lesson2.LauraShcherbak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.sqrt;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello human!");

        //byte, short, int, long, float, double, char, boolean
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 1234567890;
        float f = 1.145F;
        double d = 2.34;
        char c = 'c';
        boolean bl = true;

        System.out.println("byte b = "+b);
        System.out.println("short s = "+s);
        System.out.println("int i = "+i);
        System.out.println("long l = "+l);
        System.out.println("float f = "+f);
        System.out.println("double d = "+d);
        System.out.println("char c = "+c);
        System.out.println("boolean bl = "+bl);

        d+=i;
        System.out.println("d + i = "+d);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Integer value : ");
        i = Integer.parseInt(br.readLine());
        System.out.println("Value that is 2 times more than input = "+(i*2));

        System.out.println("14/209 + 14 * (29-13² + 14/3) = "+(14./209 + 14 * (29-13*13 + 14./3)));

        System.out.println("(5 + 2*3²)/√(7*4²/(5 + 2*2)) = "+((5 + 2*3*3)/sqrt(7.*4*4/(5 + 2*2))));
    }
}
