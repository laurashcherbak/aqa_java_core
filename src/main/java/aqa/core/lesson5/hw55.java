//sort on even
package aqa.core.lesson5;
import java.util.*;
public class hw55 {
    public static void main(String args[]) {
        int [] mas = {3, 7, 1, 4, 2};
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i=i+2) {
                if(mas[i] > mas[i+2]){
                    buf = mas[i+2];
                    mas[i+2] = mas[i];
                    mas[i] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
