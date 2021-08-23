package aqa.core.lesson5.yesyp;

public class MethodTask1 {


public static void main(String[] args) {

   int[] arr = {2, 13, 24, 13, 44, 65, 79, 81, 44, 90};
   int i = arr.length;
   int x, y;
   System.out.print("\n Array with elements that don't have duplicates: ");
   for (x = 0; x < i; x++) {
    for (y = 0; y < x; y++)
     if (arr[x] == arr[y])
      break;
    if (x == y)
     System.out.println(arr[x] + " ");
   }
  }
}









