package aqa.core.lesson5.yesyp;

public class MethodTask2 {
    public static void main(String[] args) {

        Class2 ob = new Class2();

        int[] arr1 = {5, 8, 9, 11, 24};
        int[] arr2 = {1, 9, 12, 15, 19, 24};

        System.out.print("Not common elements are: ");
        ob.uniqueElementsMergeArray(arr1, arr2);


    }
}
