package aqa.core.lesson8.yesyp;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {


        Rectangle [] arr1 = new Rectangle[5];
        arr1 [0] = new Rectangle(0, "red", 13, 14);
        arr1 [1] = new Rectangle(0, "green", 3, 7);
        arr1 [2] = new Rectangle(0, "white", 5, 8);
        arr1 [3] = new Rectangle(0, "black", 9, 11);
        arr1 [4] = new Rectangle(0, "yellow", 6, 10);

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

            }
        }






