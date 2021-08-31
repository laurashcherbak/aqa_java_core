package aqa.core.lesson9.VdovychNazar;

import java.util.Arrays;

public class Main3
{
     public static void main(String[] args) {


        char[] str = uniqueChars("Using methods of class String");
        System.out.println(Arrays.toString(str));

    }


    public static char[] uniqueChars(String s) {
        char[] arr=s.toCharArray();
        boolean[] duplicateMap = new boolean[arr.length];
        int duplicate = 0;
        int index=0;
        char[]result;
        for (int x = 0; x < arr.length; x++) {
            for (int j = 0; j < arr.length; j++) {
                if (x == j) {
                    break;
                }

                if (arr[x] == arr[j]) {
                    duplicateMap[x] = true;
                    duplicateMap[j]=true;
                    duplicate++;
                }
            }
        }
        result=new char[arr.length-duplicate];
        for(int k=0; k< arr.length;k++){
            if(!duplicateMap[k]){
                result[index]=arr[k];
                index++;
            }
        }

        return result;
    }
}
