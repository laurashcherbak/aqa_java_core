//unique elements
package aqa.core.lesson5;
import java.util.*;

public class hw52 {
    public static void main(String [] args) throws Exception
    {
        ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(1, 2, 4, 5));
        ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(1, 3, 7, 5));
        listOne.addAll(listTwo);    //Merge both lists ;)
        System.out.println(listOne);

        for (int i = 0; i < listOne.size(); i++) {
            for (int j = i + 1; j < listOne.size(); j++) {
                if(listOne.get(i) == listOne.get(j)) {
                    listOne.remove(j);
                    listOne.remove(i);
                    j--;
                }
            }
        }
        System.out.println(listOne);
    }
}
