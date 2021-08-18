package homeWork2Skrypak;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class hw2Skrypak {
    public static void main(String[] args) {

        //task 1

        System.out.println("Hello human!");

        //task 2,3

        byte b1 = 4;
        short s2 = 32;
        int i3 = 234;
        long l4 = 1895;
        float f5 = 3.768F;
        double d6 = 356.1445;
        char ch7 = 'M';
        boolean boo8 = true;

        //task 4

        System.out.println(b1);
        System.out.println(s2);
        System.out.println(i3);
        System.out.println(l4);
        System.out.println(f5);
        System.out.println(d6);
        System.out.println(ch7);
        System.out.println(boo8);

        //task 5

        System.out.println(b1 + s2);

        //Task 7

        System.out.println(14 / 209 + 14 * (29 - Math.pow(13, 2) + 14 / 3));
    }
        //Task8. чомусь результат не виводиться, не можу побачити в чому помилка

    public static void task8() {
        double x = 5 + 2 * Math.pow(3, 2);
        double y = 7 * (Math.pow(4, 2) / (5 + 2 * 2));
        double z = Math.sqrt(y);
        System.out.println("Result of task 8 is: " + x / z);
    }

    //Task 6

    public static void throws IOException {
        // Enter data using BufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Reading data using readLine
        System.out.println("Enter Integer:");
        int i = Integer.parseInt(br.readLine());
        int i2 = i * 2;
        System.out.println(i2);
    }

}
