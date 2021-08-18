package main.java.aqa.core.lesson2.ViraKrychkovska;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {
// 1.
        System.out.println("Hello human!");
// 2
        byte b1;
        short s2;
        int i3;
        long l4;
        float f5;
        double d6;
        char c7;
        boolean b8;
// 3
        b1 = 100;
        s2 = 1000;
        i3 = 100000;
        l4 = 10000000L;
        f5 = 5,123f;
        d6 = 6,12345d;
        c7 = 'C';
        b8 = true;
// 4
        System.out.println(b1);
        System.out.println(s2);
        System.out.println(i3);
        System.out.println(l4);
        System.out.println(f5);
        System.out.println(d6);
        System.out.println(c7);
        System.out.println(b8);
//5
        System.out.println(b1 + s2);
//6
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer:");
        int i = Integer.parseInt(br.readLine());
        System.out.println("Value is " + (i * 2));
//7
        double y = 14 / 209 + 14 * (29 - Math.pow(13, 2) + 14 / 3);
        System.out.println("The result is " + y);
//8
        double y = (5 + 2 * Math.pow(3, 2)) / Math.sqrt(7 * (Math.pow(4, 2) / (5 + 2 * 2));
        System.out.println("The result is " + y);
    }
}