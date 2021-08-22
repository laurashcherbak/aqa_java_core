//intersection
package aqa.core.lesson5;
import java.util.Arrays;
public class hw53 {
    public static void main(String args[]) {
        int listOne[] = {1, 2, 3};
        System.out.println("list one "+Arrays.toString(listOne));
        int listTwo[] = {2, 3, 4};
        System.out.println("list two "+Arrays.toString(listTwo));
        int result[] = {0,0};
        System.out.println("Intersection of the two arrays:");
        int k=0;
        for(int i = 0; i<listOne.length; i++ ) {
            for(int j = 0; j<listTwo.length; j++) {
                if(listOne[i]==listTwo[j]) {
                    result[k]=listOne[i];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}