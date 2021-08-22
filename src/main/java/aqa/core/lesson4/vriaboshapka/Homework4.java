package aqa.core.lesson4.vriaboshapka;

public class Homework4 {
    public static void main(String[] args) {
        int[] array =new int[100];
        int x= 15;
        for(int i =0; i<array.length; i++){
            array[i]=i+1;
            System.out.println ("searching at index: "+i+",value: "+ array[i]);
            if (array[i]==x) {
                System.out.println ("found at index: "+i+",value: "+ array[i]);
                break;
            }
        }
        int min=0;
        int max= array.length-1;
        int mid=min+((max-min)/2);
        while (min<=max){
            System.out.println ("searching at index: "+mid);
           if (array[mid]>x){
               max=mid;
           }
            if (array[mid]<x){
                min=mid;
            }
            if (array[mid]==x){
                System.out.println("found at index: " +mid);
                break;

            }
            mid=min+((max-min)/2);

        }


    }
}
