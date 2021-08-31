package aqa.core.lesson4.barabash;

public class Hw4 {
        public static void main(String[] args) {
            int[] arr =new int[100];
            int x= 15;
            for(int i =0; i<arr.length; i++){
                arr[i]=i+1;
                System.out.println ("searching index: "+i+",value: "+ arr[i]);
                if (arr[i]==x) {
                    System.out.println ("found index: "+i+",value: "+ arr[i]);
                    break;
                }
            }
            int min=0;
            int max= arr.length-1;
            int middle=min+((max-min)/2);
            while (min<=max){
                System.out.println ("searching index: "+middle);
                if (arr[middle]>x){
                    max=middle;
                }
                if (arr[middle]<x){
                    min=middle;
                }
                if (arr[middle]==x){
                    System.out.println("found index: " +middle);
                    break;

                }
                middle=min+((max-min)/2);

            }

        }
    }

