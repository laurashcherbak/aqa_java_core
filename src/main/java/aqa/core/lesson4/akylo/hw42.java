package aqa.core.lesson4.akylo;
import java.util.Scanner;
import java.util.Arrays;
public class hw42 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//      Arrays.sort(arr);
//      System.out.println(Arrays.toString(arr));

        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        System.out.print("Please input number from 0 to 15 of the SORTED array above: ");
        int x = in.nextInt();
        in.close();

        int min = 0; int max = arr.length;
        for (int i = 0; i < arr.length; i++)
            arr[i] = i + 1; int shot = 1;
        while (true) {
            System.out.println("shot: " + shot++);
            if (arr[(max + min) / 2] == x) {
                System.out.println("Found " + x);
                break;
            } else if (max == min) {
                System.out.println("Found " + x);
                break;
            }
            else if (arr[(max + min) / 2] < x) {
                min = (max + min) / 2;
            }
            else if (arr[(max + min) / 2] > x) {
                max = (max + min) / 2;
            }
        }
    }
}
