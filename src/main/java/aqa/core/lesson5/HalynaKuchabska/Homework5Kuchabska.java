package main.java.aqa.core.lesson5.HalynaKuchabska;

import java.util.Arrays;

public class Homework5Kuchabska {
    public static void main(String args[]) {
        MethodsTask task = new MethodsTask();

        int[] arr = {1,2,3,3,5,5,6,7,2,3,1};
        int[] result = task.uniqueElements(arr);
        System.out.println(Arrays.toString(result));

        int[] array1 = {1, 2, 4, 5};
        int[] array2 = {1, 3, 7, 5};
        int[] result2 = task.uniqueElementsMergeArray(array1, array2);
        System.out.println(Arrays.toString(result2));

        int[] array3 = {1, 2, 3, 7};
        int[] array4 = {2, 3, 5, 7};
        int[] result3= task.commonElements(array3, array4);
        System.out.println(Arrays.toString(result3));

        int[] array5 = {1, 2, 3, 7};
        System.out.println("Normal array");
        System.out.println(Arrays.toString(array5));
        int[] result4= task.reverseArray(array5);
        System.out.println("Reversed array");
        System.out.println(Arrays.toString(result4));

        int[] array6 = {3, 7, 1, 4, 2};
        int[] result5= task.sortEvenPositionArray(array6);
        System.out.println(Arrays.toString(result5));
    }

}
