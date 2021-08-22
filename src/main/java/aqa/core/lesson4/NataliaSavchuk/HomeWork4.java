package aqa.core.lesson4.NataliaSavchuk;

public class HomeWork4 {
    public static void main(String[] arr)
    {
       int[] array = genarateArray(100);

       System.out.println("Array:");
       printArray(array);
       System.out.println("Index: " + linearSearchArray(array, 5));
       int[] sortedArray = bubleSortArray(array);
       System.out.println("Sorted array:");
       printArray(sortedArray);
       int x = binarySearchArray(sortedArray, 6, 0, 100);
       System.out.println("Index: " + x);

    }

    public static int[] genarateArray(int length)
    {
        int[] arr = new int[length];
        for(int i = 0; i < length; i++)
        {
            arr[i] = (int) ( Math.random() * 10 );
        }
        return arr;
    }

    public static int[] bubleSortArray(int[] arr)
    {
        int length = arr.length;
        for(int i = 0; i < length-1; i++)
        {
            for (int j = 0; j < length-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }
        return arr;
    }

    public static int linearSearchArray(int[] arr, int number)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == number)
            {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearchArray(int[] arr, int number, int low, int high)
    {
        int position;
        int length = arr.length;
        int middle = (low + high)/2;
        if (high < low) {
            return -1;
        }

        if (number == arr[middle])
        {
            return middle;
        }
        else if (number < arr[middle])
        {
            return binarySearchArray(arr, number, low, middle - 1);
        }
        else
        {
            return binarySearchArray(arr, number, middle + 1, high);
        }
    }
    public static void printArray(int[] arr)
    {
        int length = arr.length;
        for(int i = 0; i < length; i++)
        {
            System.out.println(arr[i]);
        }
    }

}
