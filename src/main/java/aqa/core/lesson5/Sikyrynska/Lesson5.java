package aqa.core.lesson5.Sikyrynska;
import java.util.*;


public class Lesson5 {
    /*static void reverse(int a[], int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Друкуються елементи у зворотньому порядку.");
        int[] arr = {1, 2, 3, 4};
        reverse(arr, arr.length);
    }*/



//////////////////////////////////////////////////////
// Reversion

    static void bitonicGenerator(int arr[], int n)
    {
        // create evenArr[] and oddArr[]
        Vector<Integer> evenArr = new Vector<Integer>();
        Vector<Integer> oddArr = new Vector<Integer>();


        for (int i = 0; i < n; i++) {
            if (i % 2 != 1) {
                evenArr.add(arr[i]);
            }
            else {
                oddArr.add(arr[i]);
            }
        }

        Collections.sort(evenArr);
        Collections.sort(oddArr, Collections.reverseOrder());

        int i = 0;
        for (int j = 0; j < evenArr.size(); j++) {
            arr[i++] = evenArr.get(j);
        }
        for (int j = 0; j < oddArr.size(); j++) {
            arr[i++] = oddArr.get(j);
        }
    }

   public static void main(String[] args)
    {
        int arr[] = { 3, 7, 1, 4, 2 };
        int n = arr.length;
        bitonicGenerator(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }



//////////////////////////////////////////////////
// Common elements it two arrays


   /* public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 3, 7, 5);

        Set<Integer> union = new HashSet<Integer>(list1);
        union.addAll(list2);

        Set<Integer> intersection = new HashSet<Integer>(list1);
        intersection.retainAll(list2);

        union.removeAll(intersection);

        for (Integer n : union) {
            System.out.println(n);
        }
    }*/

    ////////////////////////////////////////////////////////////////
// Unique elements in the array


    /*public static void main(String args[]) {
        int arr[] = { 2, 3, 2, 3 };
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();

        for (int j = 0; j < arr.length; j++) {
            hashmap.put(arr[j], j);
        }
        System.out.println(hashmap.keySet());
    }*/


///////////////////////////////////////////////////
// Common elements



    /*private static void FindCommonElemet(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (String i : set) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        String[] arr1 = {"1", "2", "3"};
        String[] arr2 = { "2", "3", "4" };
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.print("Common Elements: ");
        FindCommonElemet(arr1, arr2);
    }*/
}


