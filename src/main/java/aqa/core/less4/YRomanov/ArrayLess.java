package aqa.core.less4.YRomanov;
import java.util.Arrays;
public class ArrayLess {
    public static void main(String[] args) {

        int numberArray[] = {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100};
        System.out.println("The input array: " + Arrays.toString(numberArray));

        int key = 95;
        System.out.println("\nKey to be searched=" + key);

        int first = 0;

        int last=numberArray.length-1;

        int mid = (first + last)/2;

        while( first <= last ) {

            if (numberArray[mid] < key) {
                first = mid + 1;
            } else if (numberArray[mid] == key) {
                System.out.println("Element is found at index:" + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last){
            System.out.println("Element is found");
        }
        System.out.println("My number from the group list is 18");
    }
}
