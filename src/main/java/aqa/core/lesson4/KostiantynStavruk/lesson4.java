package aqa.core.lesson4.KostiantynStavruk;

public class lesson4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = i;
        }
        System.out.println(linear(array, 5));
        System.out.println(binary(array, 21));
    }

    public static int linear(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                return i;
            }
        }
        throw new IllegalArgumentException();
    }

    public static int binary(int array[], int n) {
        int high = array.length - 1;
        int low = 0;
        if (array[array.length - 1] < array[0]) {
            return -1;
        }
        while (low <= high) {
            int mid = (low + high) / 2;
            if (n < array[mid]) {
                high = mid - 1;
            }
            if (n > array[mid]) {
                low = mid + 1;
            }
            if (n == array[mid]) {
                return mid;
            }
        }
        return -1;
    }
}
