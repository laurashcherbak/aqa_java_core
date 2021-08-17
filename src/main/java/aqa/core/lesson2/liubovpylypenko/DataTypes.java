package aqa.core.lesson2.liubovpylypenko;

public class DataTypes {

    public static void main(String[] args) {
        byte b1 = 10;
        short a2 = 0b11101;
        int p3 = 0x3c;
        long k4 = 233454653434345L;
        float f5 = 1.7456F;
        double n6 = 15.234;
        char c7 = 'b';
        boolean b8 = true;
        String s = "Hello Human";
        System.out.println(s);
        System.out.println("b1 = "+b1);
        System.out.println("a2 = "+a2);
        System.out.println("p3 = "+p3);
        System.out.println("k4 = "+k4);
        System.out.println("f5 = "+f5);
        System.out.println("n6 = "+n6);
        System.out.println("c7 = "+c7);
        System.out.println("b8 = "+b8);
        System.out.println("sum = "+sum(b1, a2));

        double exp1 = 14/209 + 14 * (29-Math.pow(13, 2) + 14/3);
        System.out.println("exp1 = "+exp1);

        double exp2 = (5 + 2 * Math.pow(3, 2))/ Math.sqrt(3);
        System.out.println("exp2 = "+exp2);
    }

    public static int sum(int x, int y){
        return x+y;
    }
}
