package aqa.core.lesson4.tymofiiuk;

public class HomeTask4 {
    public static void main(String[] args){
        //linear
        int element = 99;
        boolean notFound = true;
        int[] arr0 = { 5, 25, 3, 99, 106, 666 };
        for (int j = 0; j < arr0.length; j++) {
            if (arr0[j] == element) {
                System.out.println("Linear:");
                System.out.println(element);
                notFound = false;
                break;
            }
        }
        if (notFound) {
            System.out.println("Linear:");
            System.out.println("Not found");
        }
        //binary
        int result = 1;
        int f = 0;
        int l = arr0.length - 1;
        int m = (f + l) / 2;
        while (f <= l) {
            if (arr0[m] < result) {
                f = m + 1;
            } else if (arr0[m] == result) {
                System.out.println("Binary:");
                System.out.printf("Result\n", m);
                break;
            } else {
                l = m - 1;
            }
            m = (f + l) / 2;
        }
        if (f > l) {
            System.out.println("Binary:");
            System.out.println(result + " " + "Not found");
        }
    }
}