package aqa.core.lesson4.knenko;
import java.util.Arrays;
public class HomeWork4 {
        public static void main(String[] args) {
                //task_1
                int[] myArray = new int[100];
                int x = 57;
                for (int i = 0; i < myArray.length; i++) {
                        myArray[i] = i + 1;
                        if (myArray[i] == x) {
                                System.out.println("Value:" + myArray[i] + ", index:" + i);
                                break;
                        }
                        //task_2. Unfortunately, the second task did not work.
                        Arrays.sort(myArray);

                        int firstIndex = 0;
                        int lastIndex = myArray.length - 1;


                        while (firstIndex <= lastIndex) {
                                int middleIndex = (firstIndex + lastIndex) / 2;
                                System.out.println(middleIndex);

                                if (myArray[middleIndex] > x)
                                        lastIndex = middleIndex -1;

                                else if (myArray[middleIndex] < x)
                                        firstIndex = middleIndex +1;
                                {
                                        System.out.println(middleIndex);
                                }


                        }
                }
        }
}



