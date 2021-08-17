//package main.java.aqa.core.lesson2.akylo.alun;

import java.util.Scanner;
import static java.lang.Math.sqrt;

public class hw2 {
    public static void main(String[] args) {
//1
		System.out.println("Hello human!");
//2
//3
		byte b1 = 10;
		short s2 = 0b10001;
		int i3 = 0x3f;
		long l4 = 123038367823456L;
		float f5 = 10.838F;
		double d6 = 87.098;
		char c7 = 'b';
		boolean b8 = false;
		String s9 = "Hello alun Java";
//4
		System.out.println("byte b1 = "+b1);
        System.out.println("short s2 = "+s2);
        System.out.println("int i3 = "+i3);
        System.out.println("long l4 = "+l4);
        System.out.println("float f5 = "+f5);
        System.out.println("double d6 = "+d6);
        System.out.println("char c7 = "+c7);
        System.out.println("String s9 = "+s9);
//5		
		int x = 300;
		int y = 100;
		System.out.println("Sum x + y = "+(x+y));
//6
		Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        System.out.printf("Your doubled number is: %d \n", 2*num);
        in.close();
//7
		System.out.println("14/209 + 14 * (29-13*13 + 14/3) = "+(14.0/209 + 14 * (29-13*13 + 14.0/3)));
//8
		System.out.println("(5 + 2*3*3)/V(7*4*4/(5 + 2*2)) = "+((5 + 2*3*3)/sqrt(7.0*4*4/(5 + 2*2))));
    }
}
