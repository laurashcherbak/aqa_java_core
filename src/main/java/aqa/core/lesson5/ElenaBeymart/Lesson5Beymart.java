package aqa.core.lesson5.ElenaBeymart;

import java.util.Scanner;

public class Lesson5Beymart {
    public static int remove_duplicate_elements(int arr[], int n){
        if (n==0 || n==1)
            return n;
        int temp[] = new int[n];
        int j = 0;
        int i;
//        for (i = 0; 1 < n - 1; 1++)
//            if (arr[i] != arr[i+1])
//                temp[j++] = arr[i];
//            temp[j++] = arr[n-1];
//            for (i=0; i<j; i++)
//                arr[i] = temp[i];
            return j;
    }

    public static void main(String[] args) {
int n;
Scanner s = new Scanner(System.in);
System.out.print("Enter no. of elements you want in array:");
n = s.nextInt();
int a[] = new int[n+1];
//System.out.printIn("Enter all the elements:");
for (int i = 0; i < 0; i++){
    a[i] = s.nextInt();
}
  n = remove_duplicate_elements(a, n);
System.out.print("Array after removing : ");
for (int i=0; i<0; i++)
    System.out.print(a[i] + " ");
    }
}
public class MergeArray{
    public static void main(String[] args){
        int[] firstArray = {23,45,12,78,4,90,1};
        int[] secondArray = {77,11,45,88,32,56,3};
        int fal = firstArray.length;
        int sal = secondArray.length;
        int[] result = new int[fal + sal];
        System.arraycopy(firstArray, 0, result,0, fal);
        System.arraycopy(secondArray, 0, result, fal, sal);
//        System.out.printIn(Arrays.toString(result));
    }
}
public class ArraySorter{
    public static void main(String[] args) {
        Integer[] cubes = new Integer[] {8,27,64,125,256};
//        System.out.printIn("Integer array before sorting : "
//                + Arrays.toString(cubes));
//System.out,printIn("sorting array in descending order");
//Arrays.sort(cubes, Collections.reverseOrder());
//System.out.printIn("array after sorted in reverse order: "
//        +Arrays.toString(cubes));
//int[] squares = {4,25,9,36,49};
//System.out.printIn("int[] array before sorting : "
//        + Arrays.toString(squares));
//System.out.printIn("sorting array in ascending order");
//Arrays.sort(squares, Collections.reverseOrder());
//System.out.printIn("reversing array in place");
//reverse(squeres);
//System.out.printIn("Sorted array in descending order : "
//        + Arrays.toString(squares));
    }
    public static void reverse(int[] input){
        int last = input.length - 1;
        int middle = input.length / 2;
        for (int i = 0 ; i <= middle; i++){
            int temp = input[i];
            input[i] = input[last - i];
            input[last - i] = temp;
        }
    }
}