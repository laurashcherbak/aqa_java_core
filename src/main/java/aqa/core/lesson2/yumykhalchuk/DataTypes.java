package aqa.core.lesson2.yumykhalchuk;

/*
    1.	Write a code that will print on the screen output: Hello human!
    2.	Create variables of different primitive types (byte, short, int, long, float, double, char, boolean)
    3.	Assign values to all of your variables
    4.	Print values of created variables
    5.	Print sum of 2 digits
*/

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Hello human!");
        byte n1 = -9;
        short n2 = 8192;
        int n3 = 16777916;
        long n4 = 1073741824;
        float n5 = (float) -2.7;
        double n6 = 1.958;
        char s = 'v';
        boolean value = false;
        int sum = n2 + n3;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(s);
        System.out.println(value);
        System.out.println(sum);
    }
}
