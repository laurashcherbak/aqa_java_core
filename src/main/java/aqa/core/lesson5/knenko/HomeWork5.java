package aqa.core.lesson5.knenko;
import java.lang.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


    public class HomeWork5 {
        public static void main(String[] args) {
            //Task 1
            int[] arr1 = {1, 2, 5, 2, 4};
            int[] arr2 = {2, 3, 2, 3};

            System.out.println("Task1");
            System.out.println("Output array:" + Arrays.toString(uniqueElements(arr1)));
            System.out.println("Output array:" + Arrays.toString(uniqueElements(arr2)));

            //Task 2
            //    int[] arr3 = {1, 2, 4, 5};
            //   int[] arr4 = {1, 3, 7, 5};
            //    int[] result = uniqueElementsMergeArray(arr3, arr4);
            //      System.out.println("Task2");
            //     System.out.println("Output array:" + Arrays.toString(result));

            //Task 3
            int[] arr5 = {1, 2, 3};
            int[] arr6 = {2, 3, 4};
            System.out.println("Task3");
            System.out.println("Output array:" + Arrays.toString(commonElements(arr5, arr6)));

            //Task 4
            int[] arr7 = {1, 2, 3, 4};
            System.out.println("Task4");
            System.out.println("Output array:" + Arrays.toString(reverseArray(arr7)));

            //Task 5
            int[] arr8 = {3, 7, 1, 4, 2};
            System.out.println("Task5");
            System.out.println("Output array:" + Arrays.toString(sortEvenPositionArray(arr8)));
        }

        public static int[] uniqueElements(int[] arr) {
            int[] result = new int[0];
            for (int i = 0; i < arr.length; i++) {
                int j;
                for (j = 0; j < i; j++)
                    if (arr[i] == arr[j])
                        break;
                if (i == j) {
                    int[] tempArr = new int[result.length + 1];
                    System.arraycopy(result, 0, tempArr, 0, result.length);
                    tempArr[tempArr.length - 1] = arr[i];
                    result = tempArr;
                }
            }
            return result;
        }

          public static int[] commonElements(int[] arr5, int[] arr6) {
            int[] result = new int[]{0, 0};
            int n = 0;
            for (int i = 0; i < arr5.length; i++) {
                for (int j = 0; j < arr6.length; j++) {
                    if (arr5[i] == arr6[j]) {
                        result[n] = arr5[i];
                        n++;
                    }
                }
            }
            return result;
        }

        public static int[] reverseArray(int[] arr7) {
            int[] result = new int[arr7.length];
            int j = 0;
            for (int i = arr7.length - 1; i >= 0; i--) {
                result[j] = arr7[i];
                j++;
            }
            return result;

        }

        public static int[] sortEvenPositionArray(int[] arr8) {
            for (int i = 0; i < arr8.length; i += 2) {
                for (int j = 0; j < arr8.length - 1 - i; j += 2) {
                    if (arr8[j] > arr8[j + 2]) {
                        int temp = arr8[j];
                        arr8[j] = arr8[j + 2];
                        arr8[j + 2] = temp;
                    }
                }
            }
            return arr8;
        }
    }
