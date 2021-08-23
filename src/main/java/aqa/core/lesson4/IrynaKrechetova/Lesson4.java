package aqa.core.lesson4.IrynaKrechetova;

public class Lesson4 {
    public static void main (String[] args) {
        int[] A = new int[100];
        int n = 100;
        int s = 0;
        int e = 99;

        for (int x = 0; x <100; x++) {
            A[x] = (-10) * x;
        }

        int z = -850;

        for (int x = 0; x<100; x++) {
            if (A[x] == z) {
                System.out.println("We found it!");
                break;}
        }

        while (true) {
            if (A[s + n / 2] == z) {
                System.out.println("we found it!");
                break;
            }
            if (A[s + n / 2] < z)
                e = n / 2;
            if (A[s + n / 2] > z)
                s = s + n / 2;
            n = n / 2;

        }
    }
}
