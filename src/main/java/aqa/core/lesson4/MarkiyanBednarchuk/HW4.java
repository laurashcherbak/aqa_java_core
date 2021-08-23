package aqa.core.lesson4.MarkiyanBednarchuk;
import java.util.Arrays;
import java.util.Scanner;

public class HW4  {

        public static void main(String args[]) {
            linearSearch();
            int counter, num, item, array[], first, last;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the amount of numbers for binary search: ");
            num = input.nextInt();

            array = new int[num];
            System.out.println("Enter " + num + " number");

            for (counter = 0; counter < num; counter++)
                array[counter] = input.nextInt();
            Arrays.sort(array);
            System.out.println("Enter number to serch: ");
            item = input.nextInt();
            first = 0;
            last = num - 1;
            binarySearch(array, first, last, item);
        }

    private static void linearSearch() {
        int counter, num, item, array[];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of numbers for linear search: ");
        num = input.nextInt();
        array = new int[num];
        System.out.println("Enter " + num + " number");
        for (counter = 0; counter < num; counter++) {
            array[counter] = input.nextInt();
        }
        System.out.println("Enter number to serch: ");
        item = input.nextInt();

        for (counter = 0; counter < num; counter++) {
            if (array[counter] == item) {
                System.out.println(item + " is " + (counter+1) + " number in array");
                break;
            }
        }
        if (counter == num) {
            System.out.println("Number " + item + " not founded");
        }
    }

    public static void binarySearch(int[] array, int first, int last, int item) {
            int position;
            int comparisonCount = 1;
            position = (first + last) / 2;

            while ((array[position] != item) && (first <= last)) {
                comparisonCount++;
                if (array[position] > item) {
                    last = position - 1;
                } else {
                    first = position + 1;
                }
                position = (first + last) / 2;
            }
            if (first <= last) {
                System.out.println(item + " is " + ++position + " number in array");

            } else {
                System.out.println("Number not founded ");
            }
        }

    }
