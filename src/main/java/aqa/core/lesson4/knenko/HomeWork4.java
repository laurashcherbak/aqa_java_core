package aqa.core.lesson4.knenko;

public class HomeWork4 {
        public static void main(String[] args) {

                int[] myArray = new int[100];
                int x = 57;
                for (int i = 0; i < myArray.length; i++) {
                        myArray[i] = i + 1;
                        if (myArray[i] == x) {
                                System.out.println("Value:" + myArray[i] + ", index:" + i);
                                break;
                        }
                        //Unfortunately, the second task did not work.
                        int firstIndex = 0;
                        int lastIndex = myArray.length - 1;


                        while (firstIndex != lastIndex) {
                                int middleIndex = (firstIndex + lastIndex) / 2;

                                if (myArray[middleIndex] > x) {
                                        lastIndex = middleIndex - 1;

                                } else if (myArray[middleIndex] < x) {
                                        firstIndex = middleIndex + 1;

                                } else if (myArray[middleIndex] == x) {
                                        System.out.println(middleIndex);
                                }

                        }
                }
        }
}



