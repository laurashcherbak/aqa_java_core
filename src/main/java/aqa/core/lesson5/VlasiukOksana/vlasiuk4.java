package aqa.core.lesson5.VlasiukOksana;

public class vlasiuk4 {

//    /**
//     * Implement the method that reverses input array in the opposite order
//     * <p>
//     * Example:
//     * input array - [1, 2, 3, 4]
//     * output array - [4, 3, 2, 1]
//     *
//     * @param arr - input array
//     * @return array with opposite ordering of elements
//     */

    public static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }


        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.print(b[k]);
        }
    }

    public static void main(String[] args)
    {
        int [] arr = {1, 2, 3, 4};
        reverse(arr, arr.length);
    }
}
