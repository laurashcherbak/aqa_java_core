package aqa.core.lesson5.yesyp;

public class Class3 {
    public int[] commonElements(int[] arr1, int[] arr2) {
        int i=0, x=0;
        while (i< arr1.length && x< arr2.length ){
            if (arr1[x]==arr2[i]){
                System.out.println(arr1[x]+""); i++; x++;}
            else if (arr1[x] < arr2[i])
                x++;
            else
               i++;
        }
        {return null;}
    }
}
