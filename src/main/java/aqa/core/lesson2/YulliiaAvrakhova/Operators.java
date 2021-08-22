package aqa.core.lesson2.YulliiaAvrakhova;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operators {
    public static void main(String[] args) throws IOException {
        //1.Write a code that will print on the screen output: Hello human!
        System.out.println("Hello human!");
        //2.Create variables of different primitive types (byte, short, int, long, float, double, char, boolean)
        byte x = 1;
        short y = 2;
        int z = 3;
        long q = 98;

        float e = 5.10F;
        double t = 67.6D;

        char u = '9';
        boolean v = true;

        System.out.println("x ="+x+";  "+"y ="+y+";  "+"z ="+z+";  "+"q ="+q+"; "
                +"e ="+e+"; "+"t ="+t+"; "+"u = "+u+"; "+"v ="+v+";");
        //5.Print sum of 2 digits
        System.out.println("Sum = y+z; Sum = "+(y+z)+";");
        //6.Write a program that reads from console integer value and write to console valuethat is 2 times more than input.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer:");
        int i = Integer.parseInt(br.readLine());
        System.out.println(i*2);
        //7.Create a program which calculates the expression 14/209 + 14 * (29-13² + 14/3) and displays the result on the screen.
        double a = 14/209d ;
        double c = 14/3d;
        double s = 29 - Math.pow(13, 2) +c;
        double sum = 14*s;
        System.out.println("14/209 + 14 * (29-13² + 14/3) =");
        System.out.println(a+sum);
        //8.Calculate expression5+2∙32√❑
        double a1 = Math.pow(3,2)*2+5D;
        double b1 = Math.pow(4,2);
        double c1 = b1/(5+2*2);
        double w1 = c1 *7;
        double z1 = Math.sqrt(w1);
        System.out.println(a1/z1);
    }

}
