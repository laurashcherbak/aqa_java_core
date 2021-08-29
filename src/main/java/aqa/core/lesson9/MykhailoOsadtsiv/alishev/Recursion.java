package aqa.core.lesson9.MykhailoOsadtsiv.alishev;

public class Recursion {
    public static void main(String[] args) {
        counter(11);
        System.out.println(fac(4));
    }

    private static void counter(int n) {
        System.out.println(n);
        if (n == 0) return;
        counter(n-1);
    }

    //fac(4) = 24
    //4 * fac(3) = 12
    //3 * fac(2) = 6
    //2 * fac(1) = 2
    //fac(1) = return 1
    private static int fac (int n) {
        if (n == 1) return 1;
        return n * fac(n - 1);
    }
}
