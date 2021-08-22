//reverse
package aqa.core.lesson5;
import java.util.Arrays;
public class hw54 {
    public static void main(String args[]) {
        int a [] = {1, 2, 3, 4};
        System.out.println("array:         "+Arrays.toString(a));
        for (int k = 0; k < a.length/2; k++) {
            int temp = a[k];
            a[k] = a[a.length-(1+k)];
            a[a.length-(1+k)] = temp;
    }
        System.out.println("reverse array: "+Arrays.toString(a));
    }
}