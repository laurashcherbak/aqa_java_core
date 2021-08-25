package main.java.aqa.core.lesson5.vriaboshapka;

import java.util.ArrayList;
import java.util.List;

public class Homework5 {

        /**
         * Implement the method that returns array of unique elements of input array (filter duplicate elements)
         * <p>
         * Examples:
         * input array - [1, 2, 5, 2, 4]
         * output array - [1, 2, 5, 4]
         * <p>
         * input array - [2, 3, 2, 3]
         * output array - [2, 3]
         *
         * @param arr - array with elements
         * @return - array with elements that don't have duplicates
         */
        public static int[] uniqueElements(int[] arr) {
            boolean[] duplicateMap = new boolean[arr.length];
            int duplicate = 0;
            int index=0;
            int[]result;
            for (int x = 0; x < arr.length; x++) {
                for (int j = 0; j < arr.length; j++) {
                    if (x == j) {
                        break;
                    }
                    if (arr[x] == arr[j]) {
                        duplicateMap[x] = true;
                        duplicateMap[j]=false;
                        duplicate++;
                    }
                }
            }
            result=new int[arr.length-duplicate];
            for(int k=0; k< arr.length;k++){
                if(!duplicateMap[k]){
                    result[index]=arr[k];
                    index++;
                }
            }

                return result;
            }





            //return java.util.stream.IntStream.of(arr).distinct().toArray();



        /**
         * Implement the method that merges two arrays into one. Resulting array should consist of elements that present only in the one array and absent in other
         * <p>
         * Example:
         * arr1 - [1, 2, 4, 5],  arr2 - [1, 3, 7, 5]
         * output array - [2, 3, 4, 7]
         *
         * @param arr1 - first input array with unique elements
         * @param arr2 - second input array with unique elements
         * @return array with not common elements from input arrays
         */
        public static int[] uniqueElementsMergeArray(int[] arr1,int[] arr2) {
            boolean[]repeatmap=new boolean[arr1.length+ arr2.length];
            int[]mergedarray;
            int repeats=0;
            int index=0;
            for (int i=0; i< arr1.length;i++){
                for(int j=0; j< arr2.length;j++){
                    if(arr1[i]==arr2[j]){
                        repeatmap[i]=true;
                        repeatmap[arr1.length+j]=true;
                        repeats+=2;
                    }
                }
            }
            mergedarray=new int[repeatmap.length-repeats];
            for(int x=0; x<repeatmap.length;x++){
                if(!repeatmap[x]) {
                    if (x >= arr1.length) {
                        mergedarray[index] = arr2[x-arr1.length];
                    } else {
                        mergedarray[index] = arr1[x];
                    }
                    index++;
                }
            }
            return mergedarray;
        }

        /**
         * Implement the method that merges two arrays into one. The resulting array should consist of elements that present in both arrays
         * <p>
         * Example:
         * arr1 - [1, 2, 3] arr2 - [2, 3, 4]
         * output array - [2, 3]
         *
         * @param arr1 - first input array with unique elements
         * @param arr2 - second input array with unique elements
         * @return array with common elements from first and second arrays
         */
        public static int[] commonElements(int[] arr1,int[] arr2) {
            int maxcommons;
            int commonelements=0;
            int[]larger;
            int[]smaller;
            if(arr1.length>=arr2.length){
                maxcommons= arr2.length;
                larger=arr1;
                smaller=arr2;
            }
            else {
                maxcommons = arr1.length;
                larger=arr2;
                smaller=arr1;
            }
            boolean[]commonMap=new boolean[maxcommons];
            for(int i=0; i< smaller.length;i++){
                for (int k : larger) {
                    if (smaller[i] == k) {
                        commonMap[i] = true;
                        commonelements++;
                    }

                }

            }
          int[]result=new int[commonelements];
            for(int x=0;x<maxcommons;x++){
                if(commonMap[x]){
                    result[x]=smaller[x];
                }
            }
            return result;
        }

        /**
         * Implement the method that reverses input array in the opposite order
         * <p>
         * Example:
         * input array - [1, 2, 3, 4]
         * output array - [4, 3, 2, 1]
         *
         * @param arr - input array
         * @return array with opposite ordering of elements
         */
        public static int[] reverseArray(int[] arr) {
            int [] result=new int[arr.length];
            int index=0;
            for(int x= arr.length-1;x>=0;x--){
                result[index]= arr[x];
                index++;
            }
            return result;
        }

        /**
         * Implement the method that sorts elements of an array that place on even positions  (indexes: 0, 2, 4 ...)
         * <p>
         * Example:
         * input array - [3, 7, 1, 4, 2]
         * output array - [1, 7, 2, 4, 3]
         *
         * @param arr - input array
         * @return - sorted array of elements on even positions
         */
        public static int[] sortEvenPositionArray(int[] arr) {
            int temporary;
            for(int i = 0;i< arr.length;i+=2){
                for(int j=0;j< arr.length-i;j+=2){
                   if(arr[i]>arr[j]){
                       temporary=arr[i];
                       arr[i]=arr[j];
                       arr[j]=temporary;
                   }
                }
            }
            return arr;
        }
        public static void main(String[]args) {
            int[]arr={1,2,3,3};
            printArray(uniqueElements(arr));
            int []arr1={1,2,3,4,5};
            int[]arr2={3,4,5,6};
            printArray(commonElements(arr1,arr2));
            printArray(reverseArray(arr1));
            int[]arr3={2,4,1,7,3,11};
            printArray(sortEvenPositionArray(arr3));
            printArray(uniqueElementsMergeArray(arr1,arr2));

        }
        public static void printArray(int[]arr){
            for(int element:arr){
                System.out.print (element+",");
            }
            System.out.println();
        }
        }




